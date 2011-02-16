import java.util.Date;

class GroovyAction{

	def ctx;
	def model;
	
	def execute(){
		// messages
		"message.key.warn".warn();
		"message.key.info".info();
		"message.key.success".success();
		"message.key.error".error();
		
		// message with param
		if(!model.weight){
			"airplane.passengerscapacity.weight.required".warnWithParam(["Weight"])
		}

		// log statements
		("this is as log statement to log model referecence: [" + model + "] at debug level").logDebug();
		ctx.logError("there's also possible to log like this");
		
		// select some data from persistent storage
		def result = ctx.select(model, "from airbus a  where a.code = :code")
		ctx.setGridData(result);

		def a = model.meta.code.required;
		("A propriedade Code possui o atributo required com valor: " + a).logInfo();
		
		def d = new Date();
		ctx.logInfo("Data formatada pt_BR: " + d.pt_BR());
		ctx.logInfo("Data formatada en_US: " + d.en_US);
		ctx.logInfo("Data formatada es_SP: " + d.es_SP);
	}
}

