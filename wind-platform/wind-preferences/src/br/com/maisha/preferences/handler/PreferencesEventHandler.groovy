import br.com.maisha.wind.controller.listener.DomainObjectEventHandler;
import br.com.maisha.wind.controller.model.ExecutionContext;

class PreferencesEventHandler implements DomainObjectEventHandler{

	def ctx
	def model

	PreferencesEventHandler(){
	}

	
	ExecutionContext<?> beforeObjectOpen(ExecutionContext<Object> ctx){

	}
	
	
	ExecutionContext<?> afterObjectOpen(ExecutionContext<Object> ctx) {
		def localesDsc = [];
		def locales = Locale.getAvailableLocales();
		
		locales.each(){localesDsc << "${it}"};
		localesDsc.sort(){it.values}
		
		ctx.instance.localeList = localesDsc;
		
		return ctx;
	}
	
	
	ExecutionContext<?> beforeObjectClose(ExecutionContext<Object> ctx){
		
	}

	
	ExecutionContext<?> afterObjectClose(ExecutionContext<Object> ctx){
		
	}
	
	
}