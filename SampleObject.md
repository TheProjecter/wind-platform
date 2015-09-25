In the Terra language a basic Domain Object could be expressed as:
```
package br.com.maisha.wind.sample

import location
domain_object airbus "A 380" {

Double weight "Weight"{
x: 1
y: 1
width: 50
}


String code "Code"{
x: 2
y: 1
required: ${this.capacity > 20}
mask: LLNN
width: 80
}


Integer capacity "Passengers Capacity"{
x:3
y:1
width: 50
disabled: ${this.capacity > 20}
}


String source "Source"{
x: 1
y: 3
required: true
max_length: 5
width: 450
colspan: 3
}

String destiny "Destiny"{
x: 1
y: 4
required: true
width: 250
colspan: 3
}

String maintenanceReport "Report"{
x: 1
y: 5
required: true
presentation_type: textarea
width: 300
height: 80
colspan: 2
visible: ${this.capacity > 50}
}


operation python CalculateCapacity "Passengers Capacity"{
file: CalculateCapacity.py
}

operation groovy GroovyAction "Groovy Action"{
file: Groovy.groovy
}

}
```

The platform parses the **Domain Object** and as result we get the following screen:

![http://wind-platform.googlecode.com/svn/trunk/wind-platform/documentation/img/airbus.jpg](http://wind-platform.googlecode.com/svn/trunk/wind-platform/documentation/img/airbus.jpg)

Attributes of the domain object are represented by UI Controls. Operations are represented by buttons on the right top.