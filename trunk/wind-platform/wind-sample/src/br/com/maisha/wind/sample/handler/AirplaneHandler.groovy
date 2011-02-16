import br.com.maisha.wind.controller.listener.DomainObjectEventHandler;
import br.com.maisha.wind.controller.model.ExecutionContext;

class AirplaneHandler implements DomainObjectEventHandler{

	def ctx
	def model
	
	ExecutionContext<?> beforeObjectOpen(ExecutionContext<Object> ctx2){
		ctx.logDebug("@@@  Hey I'm a groovy handler!!!");
	}
	
	
	ExecutionContext<?> afterObjectOpen(ExecutionContext<Object> ctx) {
		

	}
	
	
	ExecutionContext<?> beforeObjectClose(ExecutionContext<Object> ctx){
		
	}

	
	ExecutionContext<?> afterObjectClose(ExecutionContext<Object> ctx){
		
	}
	
	
}