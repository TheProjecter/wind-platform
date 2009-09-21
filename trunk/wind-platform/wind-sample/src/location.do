package br.com.maisha.wind.sample

domain_object location "Location" {

String code "Code"{
x: 0
y: 1
required: true
mask: LLNN
}

double weight "City"{
x: 0
y: 2
}

double capacity "Geo Code"{
x:1
y:2
}

String source "Airport Name"{
x: 0
y: 3
required: true
}

}