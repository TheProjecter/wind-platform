import br.com.maisha.wind.common.factory.ServiceProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

class GroovyAction{

	def ctx
	def api
	def model

	GroovyAction(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		String.metaClass.warn={->
			api.warn(model.meta, delegate, null)
		}
	
		BundleContext bctx = ctx.operation.domainObject.application.bundleContext
		PreferencesService prefService = ServiceProvider.getInstance().getService(PreferencesService.class, bctx);
		
		
		Preferences generalPref  = prefService.getSystemPreferences().node("general")
		generalPref.put("currentLocale", "pt_BR")
		
		model.code =  prefService.getSystemPreferences().node("general").get("currentLocale", "none")		
		return ctx
	}
	
	
}