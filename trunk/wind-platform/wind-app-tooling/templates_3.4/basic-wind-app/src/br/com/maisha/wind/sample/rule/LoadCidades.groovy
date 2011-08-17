class LoadCidades{

	def ctx
	def model
	def meta
	
	def execute(){		
		def lst = ['Amparo', 'Campinas', 'São Paulo']
		ctx.getSession().put("content", lst);
	}
	
	
}