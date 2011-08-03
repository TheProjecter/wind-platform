class FilterProduct{

	def ctx
	def model
	def meta


	def execute(){
		def list = model.select("from Product p");
		ctx.setGridData(list);
	}
	
	
}