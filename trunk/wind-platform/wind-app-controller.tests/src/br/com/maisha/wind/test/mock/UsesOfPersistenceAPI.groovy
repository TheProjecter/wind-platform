package br.com.maisha.wind.test.mock

import br.com.maisha.wind.controller.model.ExecutionContext;


/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
class UsesOfPersistenceAPI {

	def hibernateTemplate 
	
	def execute = { ExecutionContext ctx ->
		
		ctx.session.cList = hibernateTemplate.find "from Conta c"
		
		
		ctx.session.executed = true
		ctx
	}
	
}
