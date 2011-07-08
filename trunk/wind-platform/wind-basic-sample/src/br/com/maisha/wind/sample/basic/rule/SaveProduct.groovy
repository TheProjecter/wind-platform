class SaveProduct{

	def ctx
	def model
	def meta
	
	def execute(){		
		model.save();
		"wind_basic.prod.saved".success([model.name]);
		
		def list = model.select("from Product p");
		ctx.setGridData(list);
	}
}