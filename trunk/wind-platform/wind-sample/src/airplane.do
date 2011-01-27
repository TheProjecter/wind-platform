package br.com.maisha.wind.sample

import location
domain_object airbus "A 380" {

event_handler: br/com/maisha/wind/sample/handler/AirplaneHander.groovy

Double weight "Weight"{
x: 1
y: 1
width: 50
tooltip: wind.sample.airbus.weight.tooltip
}


String code "label.airbus.code"{
x: 2
y: 1
required: ${this.capacity > 20}
mask: currency
width: 80
}


Integer capacity "Passengers Capacity"{
x:3
y:1
width: 50
disabled: ${this.capacity > 20}
}

Integer miles "Miles"{
x:1
y:2
width: 70
}

String source "Source"{
x: 1
y: 3
required: true
max_length: 5
min_length: 2
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

String type "Type"{
x: 1
y: 5
width: 250
presentation_type: combo
}

String maintenanceReport "Report"{
x: 1
y: 6
presentation_type: textarea
width: 300
height: 80
colspan: 2
visible: ${this.capacity > 50}
}

validationRule doxo {
"airplane.validation.doxo.weithlessthan": ${this.weight > 20}
"doxo2": ${this.miles < 30 }
}

operation python CalculateCapacity "Passengers Capacity"{
file: CalculateCapacity.py
validWhen: doxo
}

operation groovy GroovyAction "Groovy Action"{
file: Groovy.groovy
}


}