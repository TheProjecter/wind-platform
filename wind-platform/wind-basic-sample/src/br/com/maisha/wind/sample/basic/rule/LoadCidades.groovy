import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.preferences.IPreferenceStore;


class LoadCidades{

	def ctx
	def model
	def meta
	
	def execute(){		
		def lst = ['Amparo', 'Campinas', 'São Paulo']
		ctx.getSession().put("content", lst);
	}
	
	
}