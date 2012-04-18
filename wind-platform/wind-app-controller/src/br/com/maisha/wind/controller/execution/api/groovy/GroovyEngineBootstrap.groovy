package br.com.maisha.wind.controller.execution.api.groovy

import java.text.DateFormat;
import java.text.NumberFormat;
import org.apache.commons.lang.StringUtils;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.controller.execution.IEngineBootstrap;
import br.com.maisha.wind.controller.execution.api.MessageAPI;
import br.com.maisha.wind.controller.execution.api.PersistenceAPI;
import br.com.maisha.wind.controller.execution.api.Query;

/**
 * Bootstraps an API for ease the development of business rules written in groovy
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
class GroovyEngineBootstrap implements IEngineBootstrap{

	def messageAPI
	def persistenceAPI
	def storage

	public void bootstrap() {
		persistenceAPI = new PersistenceAPI(storage);

		doFormattingApi()
		doPersistenceApi()
				
		// MESSAGE AND LOG API //
		String.metaClass.warn={
			->
			messageAPI.warn(ctx, delegate, null);
		}

		String.metaClass.info={
			->
			messageAPI.info(ctx, delegate, null);
		}

		String.metaClass.error={
			->
			messageAPI.error(ctx, delegate, null);
		}

		String.metaClass.success={
			->
			messageAPI.success(ctx, delegate, null);
		}


		String.metaClass.warn={ param  ->
			messageAPI.warn(ctx, delegate, param as Object[]);
		}

		String.metaClass.info={ param  ->
			messageAPI.info(ctx, delegate, param as Object[]);
		}

		String.metaClass.success={ param  ->
			messageAPI.success(ctx, delegate, param as Object[]);
		}

		String.metaClass.error={ param  ->
			messageAPI.error(ctx, delegate, param as Object[]);
		}

		String.metaClass.logError={
			->
			messageAPI.logError(ctx.operation, delegate);
		}

		String.metaClass.logDebug={
			->
			messageAPI.logDebug(ctx.operation, delegate);
		}

		String.metaClass.logWarn={
			->
			messageAPI.logWarn(ctx.operation, delegate);
		}

		String.metaClass.logInfo={
			->
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

		
		ExecutionContext.metaClass.getService = { clazz ->
			def bCtx = ctx?.operation?.domainObject?.application?.bundleContext;
			if(bCtx){
				return ServiceProvider.instance.getService(clazz, bCtx);
			}
		}
	}

	def getLocale(String locale){
		def localeObj = Locale.default;
		if(locale){
			def locSplited = locale.split("_");
			localeObj = new Locale(locSplited[0], locSplited[1])
		}
		return localeObj;
	}

	
	def doPersistenceApi(){	
		ModelReference.metaClass.save = {
			->
			persistenceAPI.save(delegate);
		}

		ModelReference.metaClass.update = {
			->
			persistenceAPI.update(delegate);
		}

		ModelReference.metaClass.delete = {
			->
			persistenceAPI.delete(delegate);
		}

		Query.metaClass.list = { query, param ->
			persistenceAPI.filter(delegate, query, param as Object[]);
		}

		Query.metaClass.list = { query ->
			persistenceAPI.filter(delegate, query, null);
		}
	}
	
	def doFormattingApi(){
		Date.metaClass.getProperty = {name ->
			def originalName = name;
			name = StringUtils.capitalize(name);
			Date.metaClass."get$name" = {
				->
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
			Date.metaClass."$name" = {
				->
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

		Date.metaClass.clearHour = {
			->
			Calendar c = Calendar.instance;
			c.setTime(delegate)
			c.set(Calendar.HOUR, 0)
			c.set(Calendar.HOUR_OF_DAY, 0)
			c.set(Calendar.MINUTE, 0)
			c.set(Calendar.SECOND, 0)
			c.set(Calendar.MILLISECOND, 0)
			return c.getTime();
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

	}
	
}