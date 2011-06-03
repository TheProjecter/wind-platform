
class Filter{

	def ctx
	def model
	def meta


	def execute(){
		def list = ctx.select(meta, "select b from basic b");
		ctx.setGridData(list);
	}
	
	
}