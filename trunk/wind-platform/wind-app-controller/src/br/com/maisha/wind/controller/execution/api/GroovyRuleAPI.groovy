import br.com.maisha.wind.controller.execution.api.RuleAPI;
import  br.com.maisha.terra.lang.ModelReference;

def apiR = new RuleAPI(ctx);

String.metaClass.warn={->
	apiR.warn(model.meta, delegate, null);
}

String.metaClass.warnWithParam={ param ->
	apiR.warn(model.meta, delegate, param);
}

ModelReference.metaClass.save={->
	print "SAVE: " + delegate
}

ModelReference.metaClass.update={->
	print "SAVE: " + delegate
}
