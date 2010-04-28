package br.com.maisha.wind.trip

domain_object passenger "Passenger" {



String name "Name"{
	x: 1
	y: 1
	required: true
	width: 280
}

Integer age "Age"{
	x: 2
	y: 1
	width: ${meta.attribute('name').property('width') / 5}
}


}