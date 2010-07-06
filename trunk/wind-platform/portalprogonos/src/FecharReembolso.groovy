import br.com.maisha.wind.common.factory.ServiceProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

class Close{

	def ctx
	def api
	def model

	Close(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		if(model.fechado){
			api.warn(model.meta, "com.progonos.portal.reembolso.close.alreadyClosed", null);
			return ctx
		}
	
		// update reembolso com flag closed == true
		model.fechado = true
		api.update("portal_progonos", model)
		
		// envia um email com o reembolso formatado
		
		// sucesso
		api.success(model.meta, "com.progonos.portal.reembolso.close.success", null);
		return ctx
	}
	
	
}