import location
domain_object airbus "A380" {

string code "Code"{
x: 0
y: 1
required: true
mask: AA99
}

double weight "Weight"{
x: 0
y: 2
}

double capacity "Passengers Capacity"{
x:1
y:2
}

string source "Source"{
x: 0
y: 3
required: true
}


string destiny "Destiny"{
x: 0
y: 4
required: true
}
}