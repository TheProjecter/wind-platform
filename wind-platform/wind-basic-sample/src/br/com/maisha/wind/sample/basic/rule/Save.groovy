class Save{

	def ctx
	def model
	def meta
	
	def execute(){		
		model.save();
		"wind_basic.basic.saved".success();
	}
	
	
}