

class GroovyAction{

	def ctx
	def api
	def model

	GroovyAction(ctx, api){
		println "init Groov"
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		println "execute"
		api.warn("i'm comming")
		model.source = "i'm comming"
		return ctx
	}
	
	
}