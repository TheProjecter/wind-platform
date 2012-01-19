package br.com.maisha.wind.sample.domain

domain_object basic "Basic"{

	String name "Name"{
		x: 1
		y: 1
		required:true
		width: 340
	}


	String sexo "Sexo"{
		x:1
		y:2
		presentation_type: combo
		validValues: ["Masculino", "Feminino"]
		width: 100
	}

}