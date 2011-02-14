import br.com.maisha.wind.common.factory.ServiceProvider;

class GroovyAction{

	def ctx;
	def model;

	Object execute(){
		"airplane.passengerscapacity.weight.required".warnWithParam(["aa", "bb"])

		model.save();
				
		return ctx
	}
}