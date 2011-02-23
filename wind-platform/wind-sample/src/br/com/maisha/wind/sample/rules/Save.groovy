import java.util.Date;
import br.com.maisha.wind.common.preferences.IPreferenceStore;

class Save{

	def ctx;
	def model;
	
	def execute(){
		model.save();
		"wind.sample.airbus.save.success".success();
	}
}

