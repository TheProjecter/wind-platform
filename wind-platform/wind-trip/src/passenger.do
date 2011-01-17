package br.com.maisha.wind.trip

domain_object passenger "Passenger" {

String name "label.passenger.name"{
	x: 1
	y: 1
	required: true
	width: 280
	colspan: 2
}

Integer age "label.passenger.age"{
	x: 1
	y: 2
	width: 50
}

Integer sit "label.passenger.sit"{
	x: 1
	y: 3
	disabled: ${!this.smoker}
	width: 50 
}

Boolean smoker "label.passenger.smoker"{
	x: 2
	y: 3
	presentation_type: checkbox
}
}