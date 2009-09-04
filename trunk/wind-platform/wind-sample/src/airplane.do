import location
domain_object airbus "A 380" {



String code "Code"{
x: 2
y: 1
required: true
mask: LLNN
width: 80
}

double weight "Weight"{
x: 1
y: 1
width: 50
}

double capacity "Passengers Capacity"{
x:3
y:1
width: 50
disabled: true
}


String source "Source"{
x: 1
y: 3
required: true
max_length: 5
width: 250
colspan: 3
}

String destiny "Destiny"{
x: 2
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
}

operation python save "Salvar"{
file: RuleSave.py
}

}