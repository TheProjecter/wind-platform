class Filter{

	def ctx
	def model
	def meta

	def execute(){
		def list = model.select("from basic b");
		ctx.setGridData(list);
	}
}