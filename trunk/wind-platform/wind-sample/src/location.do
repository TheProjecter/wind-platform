package br.com.maisha.wind.sample

domain_object location "Location" {

String code "Code"{
x: 0
y: 1
required: true
mask: LLNN
}

Double weight "City"{
x: 0
y: 2
}

Double capacity "Geo Code"{
x:1
y:2
}

String source "Airport Name"{
x: 0
y: 3
required: true
}

}