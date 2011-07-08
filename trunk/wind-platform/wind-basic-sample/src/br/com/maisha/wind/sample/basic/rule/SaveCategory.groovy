class SaveCategory{

	def ctx
	def model
	def meta
	
	def execute(){		
		model.save();
		"wind_basic.cat.saved".success([model.name]);
		
		def list = model.select("from Category c");
		ctx.setGridData(list);
	}
}