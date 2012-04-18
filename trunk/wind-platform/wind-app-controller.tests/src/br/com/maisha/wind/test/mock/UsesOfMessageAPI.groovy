/**
 * 
 */
package br.com.maisha.wind.test.mock

import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
class UsesOfMessageAPI {

	
	def execute(ExecutionContext ctx){
		println "Executing UsesOfMessageAPI#execute(ctx)"
		
		"this is a warn".warn()
		"this is an info".info()
		"this is an error".error()
		"this is a success".success()
		
		
		"this is a warn with {0}".warn(["PARAM"])
		"this is an info with {0}".info(["PARAM"])
		"this is an error with {0}".error(["PARAM"])
		"this is a success with {0}".success(["PARAM"])
		
		
		ctx.session.put("executed", true);
		ctx
	}
	
}
