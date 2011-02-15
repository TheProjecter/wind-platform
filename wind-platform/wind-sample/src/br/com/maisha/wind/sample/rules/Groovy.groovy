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
		"airplane.passengerscapacity.weight.required".warnWithParam(["aa", "bb"])

		// log statements
		("this is as log statement to log model referecence: [" + model + "] at debug level").logDebug();
		ctx.logError("there's also possible to log like this");
		
		// select some data from persistent storage
		def result = ctx.select(model, "from airbus a  where a.code = :code")
		ctx.setGridData(result);

	}
}

