import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;


class Save{

	def ctx
	def model

	
	def execute(){		
		def bCtx = ctx.operation.domainObject.application.bundleContext
		
		IPreferenceStore prefService = ServiceProvider.getInstance().getService(
				IPreferenceStore.class, bCtx);
		
		prefService.put("general", "currentLocale", model.locale);
		prefService.put("general", "maxResultsDisplayed", model.maxResultsDisplayed.toString());
		prefService.put("general", "datePattern", model.datePattern);
		
		
		IApplicationController appMgr = ServiceProvider.getInstance().getService(
				IApplicationController.class, bCtx);
		appMgr.configureAllLabels(bCtx);
		
		"wind_preferences.preferences.saved".success();
	}
	
	
}