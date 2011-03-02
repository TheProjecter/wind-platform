package br.com.maisha.wind.sample

import location
domain_object airbus "A 380" {

event_handler: br/com/maisha/wind/sample/handler/AirplaneHandler.groovy

Double weight "label.airbus.weight"{
x: 1
y: 1
width: 50
tooltip: wind.sample.airbus.weight.tooltip
}


String code "label.airbus.code"{
x: 2
y: 1
required: ${this.capacity > 20}
width: 80
required: true
}


Integer capacity "label.airbus.capacity"{
x:3
y:1
width: 50
required: true
}

Integer miles "label.airbus.miles"{
x:1
y:2
width: 70
}

String source "label.airbus.src"{
x: 1
y: 3
required: true
max_length: 5
min_length: 2
width: 450
colspan: 3
}

String destiny "label.airbus.destiny"{
x: 1
y: 4
required: true
width: 250
colspan: 3
}

String maintenanceReport "label.airbus.report"{
x: 1
y: 5
presentation_type: textarea
width: 300
height: 80
colspan: 2
visible: ${this.miles >= 1000}
}

validationRule doxo {
"airplane.validation.doxo.weithlessthan": ${this.weight > 20}
}

operation python CalculateCapacity "Python"{
file: br/com/maisha/wind/sample/rules/CalculateCapacity.py
validWhen: doxo
visible:false
}

operation groovy GroovyAction "Groovy"{
file: br/com/maisha/wind/sample/rules/Groovy.groovy
visible:false
}

operation groovy Save "Save"{
file: br/com/maisha/wind/sample/rules/Save.groovy
}

operation groovy Filter "Filter"{
file: br/com/maisha/wind/sample/rules/Filter.groovy
validate: false
}

}