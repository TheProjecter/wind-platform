import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;

import org.osgi.service.prefs.PreferencesService;

class Save{

	def ctx
	def api
	def model
	def log

	Save(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
		this.log = ctx.log
	}
	
	Object execute(){
		String.metaClass.success={->
			api.success(model.meta, delegate, null)
		}		
		
		def bCtx = ctx.operation.domainObject.application.bundleContext
		
		IPreferenceStore prefService = ServiceProvider.getInstance().getService(
				IPreferenceStore.class, bCtx);
		
		prefService.put("general", "currentLocale", model.locale);
		prefService.put("general", "maxResultsDisplayed", model.maxResultsDisplayed.toString());
		
		
		"wind_preferences.preferences.saved".success();
		return ctx
	}
	
	
}