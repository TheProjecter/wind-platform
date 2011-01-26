import br.com.maisha.wind.controller.listener.DomainObjectEventHandler;
import br.com.maisha.wind.controller.model.ExecutionContext;

class PreferencesEventHandler implements DomainObjectEventHandler{

	def ctx
	def api
	def log

	PreferencesEventHandler(ctx, api){
		this.ctx = ctx
		this.api = api
		this.log = ctx.log
	}

	
	ExecutionContext<?> beforeObjectOpen(ExecutionContext<Object> ctx){
		log.debug("@@@  Hey I'm a groovy handler!!!");
	}
	
	
	ExecutionContext<?> afterObjectOpen(ExecutionContext<Object> ctx) {
		
	}
	
	
	ExecutionContext<?> beforeObjectClose(ExecutionContext<Object> ctx){
		
	}

	
	ExecutionContext<?> afterObjectClose(ExecutionContext<Object> ctx){
		
	}
	
	
}