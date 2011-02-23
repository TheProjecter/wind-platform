import java.util.Date;
import br.com.maisha.wind.common.preferences.IPreferenceStore;

class Filter{

	def ctx;
	def model;
	
	def execute(){
		ctx.setGridData(ctx.select(model, "from airbus p"));
	}
}

