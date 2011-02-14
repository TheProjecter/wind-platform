import br.com.maisha.wind.controller.execution.api.RuleAPI;
import  br.com.maisha.terra.lang.ModelReference;

def apiR = new RuleAPI(ctx);

String.metaClass.warn={->
	apiR.warn(model.meta, delegate, null);
}

String.metaClass.info={->
	apiR.info(model.meta, delegate, null);
}

String.metaClass.error={->
	apiR.error(model.meta, delegate, null);
}

String.metaClass.success={->
	apiR.success(model.meta, delegate, null);
}


String.metaClass.warnWithParam={ param  ->
	apiR.warn(model.meta, delegate, param as Object[]);
}

String.metaClass.infoWithParam={ param  ->
	apiR.info(model.meta, delegate, param as Object[]);
}

String.metaClass.successWithParam={ param  ->
	apiR.success(model.meta, delegate, param as Object[]);
}

String.metaClass.errorWithParam={ param  ->
	apiR.error(model.meta, delegate, param as Object[]);
}





ModelReference.metaClass.save={->
	print "SAVE: " + delegate
}

ModelReference.metaClass.update={->
	print "SAVE: " + delegate
}

ModelReference.metaClass.delete={->
	print "SAVE: " + delegate
}


