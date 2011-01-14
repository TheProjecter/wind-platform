import br.com.maisha.wind.lifecycle.mgmt.IApplicationManager;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;


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
		prefService.put("general", "datePattern", model.datePattern);
		
		
		IApplicationManager appMgr = ServiceProvider.getInstance().getService(
				IApplicationManager.class, BCtx);
		appMgr.configureAllLabels(bCtx);
		
		"wind_preferences.preferences.saved".success();
		return ctx
	}
	
	
}