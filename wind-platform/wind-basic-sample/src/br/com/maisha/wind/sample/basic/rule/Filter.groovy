import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;
import org.osgi.service.prefs.Preferences;
import br.com.maisha.terra.lang.ModelReference;

class Filter{

	def ctx
	def model
	def meta


	def execute(){
		def list = ctx.select(meta, "select b from basic b");
		ctx.setGridData(list);
	}
	
	
}