import br.com.maisha.wind.common.factory.ServiceProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;

class Save{

	def ctx
	def model
	
	def execute(){
		ctx.logDebug("aaaaa");
		
		ctx.logDebug("aaa: " + model);
		ctx.logDebug(model?.item);
		
		"com.progonos.portal.reembolso.save.success".success();
	}
}