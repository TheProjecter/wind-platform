import br.com.maisha.wind.common.factory.ServiceProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

class Save{

	def ctx
	def api
	def model

	Save(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		api.save("portal_progonos", model);
		api.success(model.meta, "com.progonos.portal.configuracoes.save.success", null);
		return ctx
	}
	
	
}