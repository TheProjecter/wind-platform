domain_object location "Localizacao" {

String code "Code"{
x: 0
y: 1
required: true
mask: AA99
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