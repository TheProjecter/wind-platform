class Save{

	def ctx
	def model
	def meta
	
	def execute(){		
		model.save();
		"Basic cadastrado com sucesso!".success();
	}
	
	
}