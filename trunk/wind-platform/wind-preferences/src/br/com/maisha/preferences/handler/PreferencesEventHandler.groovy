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