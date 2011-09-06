class LoadProdutos{

	def ctx
	def model
	def meta


	def execute(){
		def list = model.select("from Product p ");
		ctx.getSession().put("content", list);
	}
	
	
}