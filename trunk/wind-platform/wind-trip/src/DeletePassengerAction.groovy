import br.com.maisha.wind.common.factory.ServiceProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

class DeletePassengerAction{

	def ctx
	def api
	def model

	DeletePassengerAction(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		ctx.gridSelection.each() { api.delete("trip_control", it.get("ref")) }
		api.info(model.meta, "msg.passengers.delete.success", model.name)
		
		return ctx
	}
	
	
}