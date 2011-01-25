import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;
import org.osgi.service.prefs.Preferences;
import br.com.maisha.terra.lang.ModelReference;

class Filter{

	def ctx
	def api
	def log

	Filter(ctx, api){
		this.ctx = ctx
		this.api = api
		this.log = ctx.log
	}
	
	Object execute(){
		def bCtx = ctx.operation.domainObject.application.bundleContext
		
		IPreferenceStore prefService = ServiceProvider.getInstance().getService(
				IPreferenceStore.class, bCtx);
		
		//get the node
		Preferences node = prefService.getNode("general");
		
		//creates a new instance
		def instance = ctx.operation.domainObject.objectClass.newInstance();
		
		//populate
		instance.meta = ctx.operation.domainObject;
		instance.locale = node.get("currentLocale", null);
		instance.maxResultsDisplayed = node.getInt("maxResultsDisplayed", 0);
		instance.datePattern = node.get("datePattern", null); 		
		
		//put it on context
		def list = new ArrayList<ModelReference>();
		list.add(instance);
		ctx.setGridData(list);
		
		return ctx
	}
	
	
}