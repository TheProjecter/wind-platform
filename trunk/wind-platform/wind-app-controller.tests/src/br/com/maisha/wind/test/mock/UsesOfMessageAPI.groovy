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
		
		//simple message
		"this is a warn".warn(ctx)
		"this is an info".info(ctx)
		"this is an error".error(ctx)
		"this is a success".success(ctx)
		
		//simple message with param
		"this is a warn with {0}".warn(ctx, ["PARAM"])
		"this is an info with {0}".info(ctx, ["PARAM"])
		"this is an error with {0}".error(ctx, ["PARAM"])
		"this is a success with {0}".success(ctx, ["PARAM"])
		
		//simple message with multiple params
		"this is a success with a {0} and another {1}".success(ctx, ["param", "one"])
		
		// message key with multiple params
		"wind.appcontroller.test.messagekey".success(ctx, ["used", "tests"])
		
		
		// log
		"\n log info \n".logInfo(ctx)
		"\n log warn \n".logWarn(ctx)
		"\n log debug \n".logDebug(ctx)
		"\n log error \n".logError(ctx)
		
		ctx.logInfo("\n log info 2 \n")
		ctx.logWarn("\n log warn  2 \n")
		ctx.logDebug("\n log debug 2 \n")
		ctx.logError("\n log error 2 \n")
		
		
		ctx.session.put("executed", true);
		ctx
	}
	
}
