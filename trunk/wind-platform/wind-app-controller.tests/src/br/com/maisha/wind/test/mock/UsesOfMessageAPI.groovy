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
		
		"this is a warn".warn(ctx)
		"this is an info".info(ctx)
		"this is an error".error(ctx)
		"this is a success".success(ctx)
		
		
		"this is a warn with {0}".warn(ctx, ["PARAM"])
		"this is an info with {0}".info(ctx, ["PARAM"])
		"this is an error with {0}".error(ctx, ["PARAM"])
		"this is a success with {0}".success(ctx, ["PARAM"])
		
		"this is a success with a {0} and another {1}".success(ctx, ["param", "one"])
		
		"wind.appcontroller.test.messagekey".success(ctx, ["used", "tests"])
		
		ctx.session.put("executed", true);
		ctx
	}
	
}
