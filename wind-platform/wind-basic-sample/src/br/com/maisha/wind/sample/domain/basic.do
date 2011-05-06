package br.com.maisha.wind.sample.domain

domain_object basic "Basic"{

	open_filtering: true
	
	String name "Nome"{
		x: 1
		y: 1
		required:true
		width: 340
		colspan: 2
	}
	
	Date birhtDate "Data de Nascimento"{
		x:1
		y:2
		required:true
		presentation_type: date
		width: 120
	}
	
	Integer age "Idade"{
		x:2
		y:2
		disabled:false
		width: 40
	}
	
	Double altura "Altura"{
		x:1
		y:3
		colspan: 2
		width: 40
	}

	String sexo "Sexo"{
		x:1
		y:4
		presentation_type: combo
		validValues: ["1": "Masculino", "2": "Feminino"]
	}

	operation groovy Save "Salvar"{
		file: br/com/maisha/wind/sample/basic/rule/Save.groovy
	}
	
	operation groovy Filter "Filtrar"{
		file: br/com/maisha/wind/sample/basic/rule/Filter.groovy
		is_filter:true
		validate: false
	}

}