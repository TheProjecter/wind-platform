import org.osgi.service.prefs.Preferences; 

import br.com.maisha.wind.common.factory.ServiceProvider;
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
		String.metaClass.success={->
			api.success(model.meta, delegate, null)
		}		
		
		def bCtx = ctx.operation.domainObject.application.bundleContext
		
		PreferencesService prefService = ServiceProvider.getInstance().getService(
			PreferencesService.class, bCtx);
		
		
		Preferences general = prefService.getSystemPreferences().node("general");
		general.put("currentLocale", model.locale);
		general.putInt("maxResultsDisplayed", model.maxResultsDisplayed);
		
		
		"wind_preferences.preferences.saved".success();
		return ctx
	}
	
	
}