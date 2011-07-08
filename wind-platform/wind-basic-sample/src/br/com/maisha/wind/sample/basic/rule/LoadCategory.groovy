class LoadCategory{

	def ctx
	def model
	def meta


	def execute(){
		def list = model.select("from Category c where c.active = ? ", [true]);
		ctx.getSession().put("content", list);
	}
	
	
}