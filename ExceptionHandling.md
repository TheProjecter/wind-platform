# Introduction #
This page describes and discusses how to properly treat exceptions when coding [platform modules](Glossary.md) or [application modules](Glossary.md).


# When to throw and when to catch #
All exceptions should be thrown to the presentation layer (i.e wind-faces module). There it will be presented to the user, logged, or both. An utility class (_br.com.maisha.commom.exception.ExceptionHandler_) from **wind-commom** module, may help to handle an exception.

```

try{

 ...

}catch(Exception e){

     ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);

}

```