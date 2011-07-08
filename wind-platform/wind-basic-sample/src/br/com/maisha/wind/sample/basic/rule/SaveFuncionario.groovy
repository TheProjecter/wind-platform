class SaveFuncionario{

	def ctx
	def model
	def meta
	
	def execute(){		
		model.save();
		"wind_basic.func.saved".success([model.nome]);
		
		def list = model.select("from funcionario c");
		ctx.setGridData(list);
	}
}