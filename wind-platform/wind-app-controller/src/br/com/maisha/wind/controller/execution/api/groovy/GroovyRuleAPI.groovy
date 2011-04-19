package br.com.maisha.wind.controller.execution.api.groovy

import java.text.DateFormat;
import java.text.NumberFormat;
import org.apache.commons.lang.StringUtils;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.controller.execution.api.MessageAPI;
import br.com.maisha.wind.controller.execution.api.PersistenceAPI;

def messageAPI = new MessageAPI(ctx);
def persistenceAPI = new PersistenceAPI(storage);

// MESSAGE AND LOG API //
String.metaClass.warn={->
	messageAPI.warn(model.meta, delegate, null);
}

String.metaClass.info={->
	messageAPI.info(model.meta, delegate, null);
}

String.metaClass.error={->
	messageAPI.error(model.meta, delegate, null);
}

String.metaClass.success={->
	messageAPI.success(model.meta, delegate, null);
}


String.metaClass.warnWithParam={ param  ->
	messageAPI.warn(model.meta, delegate, param as Object[]);
}

String.metaClass.infoWithParam={ param  ->
	messageAPI.info(model.meta, delegate, param as Object[]);
}

String.metaClass.successWithParam={ param  ->
	messageAPI.success(model.meta, delegate, param as Object[]);
}

String.metaClass.errorWithParam={ param  ->
	messageAPI.error(model.meta, delegate, param as Object[]);
}

String.metaClass.logError={->
	messageAPI.logError(ctx.operation, delegate);
}

String.metaClass.logDebug={->
	messageAPI.logDebug(ctx.operation, delegate);
}

String.metaClass.logWarn={->
	messageAPI.logWarn(ctx.operation, delegate);
}

String.metaClass.logInfo={->
	messageAPI.logInfo(ctx.operation, delegate);
}


ExecutionContext.metaClass.logInfo = { msg ->
	messageAPI.logInfo(ctx.operation, msg);
}

ExecutionContext.metaClass.logWarn = { msg ->
	messageAPI.logWarn(ctx.operation, msg);
}

ExecutionContext.metaClass.logDebug = { msg ->
	messageAPI.logDebug(ctx.operation, msg);
}

ExecutionContext.metaClass.logError = { msg ->
	messageAPI.logError(ctx.operation, msg);
}
// END OF MESSAGE AND LOG API //

// -------------------------------------------------------------//

// PERSISTENCE API //
ModelReference.metaClass.save = { ->
	persistenceAPI.save(delegate);
}

ModelReference.metaClass.update = { ->
	persistenceAPI.update(delegate);
}

ModelReference.metaClass.delete = { ->
	persistenceAPI.delete(delegate);
}

ExecutionContext.metaClass.select = { model, query, param ->
	persistenceAPI.filter(model, query, param as Object[]);
}

ExecutionContext.metaClass.select = { model, query ->
	persistenceAPI.filter(model, query, null);
}
// END OF PERSISTENCE API //

//-------------------------------------------------------------//

// FORMATTING API //
Date.metaClass.getProperty = {name ->
	def originalName = name;
	name = StringUtils.capitalize(name);
	Date.metaClass."get$name" = { ->
		def locSplited = name.split("_");
		def DateFormat df = DateFormat.getDateInstance(
				DateFormat.DEFAULT, 
				new Locale(locSplited[0], locSplited[1]));
		return df.format(delegate); 
	}
	
	def metaProperty= Date.metaClass.getMetaProperty(originalName)
	if(metaProperty){
		return metaProperty.getProperty(delegate);
	}
}

Date.metaClass.methodMissing = { String name, args->
	Date.metaClass."$name" = { ->
		def locSplited = name.split("_");
		def DateFormat df = DateFormat.getDateInstance(
				DateFormat.DEFAULT, 
				new Locale(locSplited[0], locSplited[1]));
		return df.format(delegate); 
	}
	
	def metaMethod= Date.metaClass.getMetaMethod(name, args) 
	if(metaMethod){
		return metaMethod.invoke(delegate,args)
	}
}

Date.metaClass.clearHour = { ->
	Calendar c = Calendar.instance;
	c.setTime(delegate)
	c.set(Calendar.HOUR, 0)
	c.set(Calendar.HOUR_OF_DAY, 0)
	c.set(Calendar.MINUTE, 0)
	c.set(Calendar.SECOND, 0)
	c.set(Calendar.MILLISECOND, 0)
	return c.getTime();
}

def getLocale(String locale){
	def localeObj = Locale.default;
	if(locale){
		def locSplited = locale.split("_");
	    localeObj = new Locale(locSplited[0], locSplited[1])
	}
	return localeObj;
}

Date.metaClass.hour = { String locale ->
	def localeObj = getLocale(locale);
	def DateFormat df = DateFormat.getTimeInstance(
		DateFormat.DEFAULT, 
		localeObj);
	return df.format(delegate); 
}


Number.metaClass.currency = { String locale ->
	def localeObj = getLocale(locale);
	def NumberFormat nf = NumberFormat.getCurrencyInstance(localeObj);
	return nf.format(delegate);
}

Number.metaClass.percent = { String locale ->
	def localeObj = getLocale(locale);
	def NumberFormat nf = NumberFormat.getPercentInstance(localeObj);
	return nf.format(delegate);
}

Number.metaClass.percentOf = { total ->

}
//END OF FORMATTING API //

//-------------------------------------------------------------//

//END OF SERVICES API //
ExecutionContext.metaClass.getService = { clazz ->
	def bCtx = ctx?.operation?.domainObject?.application?.bundleContext;
	if(bCtx){
		return ServiceProvider.instance.getService(clazz, bCtx);
	}
}