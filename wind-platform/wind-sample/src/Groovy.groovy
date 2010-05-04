

class GroovyAction{

	def ctx
	def api
	def model

	GroovyAction(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		String.metaClass.warn={->
			api.warn(delegate)
		}
	
		api.warn("i'm comming")
		"doxo".warn();
		model.source = "i'm comming"
		return ctx
	}
	
	
}