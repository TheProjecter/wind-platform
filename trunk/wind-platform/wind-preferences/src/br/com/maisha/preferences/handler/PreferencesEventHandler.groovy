import br.com.maisha.wind.controller.listener.DomainObjectEventHandler;
import br.com.maisha.wind.controller.model.ExecutionContext;
import  br.com.maisha.terra.lang.ValidValue;

class PreferencesEventHandler implements DomainObjectEventHandler{

	def ctx
	def model

	PreferencesEventHandler(){
	}

	
	ExecutionContext<?> beforeObjectOpen(ExecutionContext<Object> ctx){

	}
	
	
	ExecutionContext<?> afterObjectOpen(ExecutionContext<Object> ctx) {
		return ctx;
	}
	
	
	ExecutionContext<?> beforeObjectClose(ExecutionContext<Object> ctx){
		
	}

	
	ExecutionContext<?> afterObjectClose(ExecutionContext<Object> ctx){
		
	}
	
	
}