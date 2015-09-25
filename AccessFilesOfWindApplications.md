# Introduction #

A wind application is every module deployed in the wind platform. Sometimes the platform needs to load files located inside these bundles. Below is described how to to that.


# Load a wind application file #
The object **br.com.maisha.terra.lang.WindApplication** contains the application meta information retrieved by reading **-app-cfg.xml** loacated at META-INF of each wind application.

It is possible to obtain a reference to a **WindApplication** using the Application Registry:

```
br.com.maisha.wind.lifecycle.registry.IApplicationRegistry.retrieve(String appId);
```

The **IApplicationRegistry** is published as an OSGi service. So you may get a reference to this service by calling:

```
IApplicationRegistry appReg = ServiceProvider
  .getInstance().getService(IApplicationRegistry.class, ctx);
```

A reference to a **WindApplication** is also available at each **DomainObject**. So if you got your domain object you can get his **WindApplication**.

Once you have a **WindApplication**, you can use **WindApplication.getBundleContext()** to get a reference to its OSGi BundleContext and then access any file or resource located inside that bundle.