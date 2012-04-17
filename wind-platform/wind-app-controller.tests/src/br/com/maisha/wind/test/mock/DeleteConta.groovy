/**
 * 
 */
package br.com.maisha.wind.test.mock

import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
class DeleteConta {

	def groovyApi
	
	def execute(ExecutionContext ctx){
		println "Executing DeleteConta#execute(ctx)"
		ctx.session.put("executed", true);
		ctx.session.put("date", new Date().pt_BR)
		ctx
	}
	
}
