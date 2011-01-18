import br.com.maisha.wind.common.factory.ServiceProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

class SavePassengerAction{

	def ctx
	def api
	def model

	SavePassengerAction(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		api.save("trip_control", model)
		api.info(model.meta, "msg.passengers.save.success", model.name)
				
		return ctx
	}
	
	
}