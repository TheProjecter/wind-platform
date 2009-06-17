domain_object location "Localizacao" {

string code "Code"{
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

string source "Airport Name"{
x: 0
y: 3
required: true
}

}