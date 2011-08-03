class FiltrarFuncionario{

	def ctx
	def model
	def meta


	def execute(){
		def list = model.select("from Funcionario c");
		ctx.setGridData(list);
	}
	
	
}