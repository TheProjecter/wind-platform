import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;


class Save{

	def ctx
	def model
	def meta
	
	def execute(){		
		model.save();
		"wind_basic.basic.saved".success();
	}
	
	
}