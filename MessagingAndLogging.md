# Messages #
Messages are displayed by the Message View and can be of 4 types:
  * Info (info())
  * Success (success())
  * Warning (warning())
  * Error (error())

An API is provided to allow users send a message to the Message View. There are two ways to do this, one is by calling messages methods from any string. The other is by calling from the [Execution Context](ExecutionContext.md).

From Strings
```
"This is a warning message".warn()
"This is an error message".error()
"This is an info message".info()
"This is a success message".success()
```

From [Execution Context](ExecutionContext.md)
```
ctx.warn("This is a warning message")
ctx.error("This is an error message")
ctx.info("This is an info message")
ctx.success("This is a success message")
```


From [Execution Context](ExecutionContext.md) with parameters
```
ctx.warn("This is a {0} message", ["warning"])
ctx.error("This is an {0} message", ["error"])
ctx.info("This is an {0} message", ["info"])
ctx.success("This is a {0} message", ["success"])
```

Using keys (defined by a properties file)
```
ctx.warn("com.doxo.test.message", ["1st parameter"])
```


# Log #
There is four levels of log, info, warn, debug and error. For each level there is method at [Execution Context](ExecutionContext.md).

```
ctx.logInfo("Log INFO");
ctx.logWarn("Log WARN");
ctx.logDebug("Log DEBUG");
ctx.logError("Log ERROR");
```