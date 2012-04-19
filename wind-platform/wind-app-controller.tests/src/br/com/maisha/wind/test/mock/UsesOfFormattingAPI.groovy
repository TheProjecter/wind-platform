package br.com.maisha.wind.test.mock

import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
class UsesOfFormattingAPI {

	
	def execute(ExecutionContext ctx){
		println "Executing UsesOfFormattingAPI#execute(ctx)"

		Date d = new Date()
		ctx.session.put("date_pt_BR", d.pt_BR)
		ctx.session.put("date_en_US", d.en_US)
		ctx.session.put("date_hour", d.hour("pt_BR"))
		ctx.session.put("clearHour", d.clearHour())
		
		Number n = 15.96
		ctx.session.put "currency", n.currency("pt_BR")
		ctx.session.put "percent" , n.percent("pt_BR")
		ctx.session.put "currency_en_US", n.currency("en_US")
		ctx.session.put "percent_en_US" , n.percent("en_US")
		ctx.session.put "percent_Of", 10.percentOf(1500)
		
		println ctx.session
		
		ctx.session.put("executed", true);
		ctx
	}
	
}
