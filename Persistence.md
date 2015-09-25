# Supported Operations #

In the examples bellow, **model** is a reference for ModelReference.


Save
```
model.save();
```


Update
```
model.update();
```


Delete
```
model.delete();
```

Select
```
//ctx is the ExecutionContext.
ctx.select(model, query);
```

# Pratical Examples #
```


class GroovyAction{

	def ctx;
	def model;
	
	def execute(){
	        // persist
                model.save();

                model.closed = true;

                // update
                model.update();

                // select some data from persistent storage
		def result = ctx.select(model, "from SomeBusinessThing a  where a.code = :code");

               // delete
               model.delete();
	}
}

```

