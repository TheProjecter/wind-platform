package br.com.maisha.wind.sample.domain

domain_object basic "Basic"{

	open_filtering: true
	
	folder personal "Personal Info"{
		visible: true
		sequence: 1
	}
	
	folder contacts "Contacts"{
		visible: true
		sequence: 2
	}
	
	folder financial "Financial"{
		visible: true
		sequence: 3
	}
	
	Group address "Address"{
		x: 1
		y: 5
		colspan: 2
		presentation_type: group
		folder: personal
		rowspan: 2
		width: 550
		height: 130
	}

	
	Group child "Child"{
		x: 1
		y: 3
		presentation_type: group
		parent_group: address
		width: 250	
		height: 50
	}
	
	String childAttr "Child Attr"{
		x:1
		y:1
		parent_group: child
	}
	
	String name "Nome"{
		x: 1
		y: 1
		required:true
		width: 340
		colspan: 2
		folder: personal
	}
	
	Date birhtDate "Data de Nascimento"{
		x:1
		y:2
		required:true
		presentation_type: date
		width: 120
		value: ${this.birhtDate == null ? currDate : this.birhtDate}
		folder: personal
	}
	
	Integer age "Dias de Vida"{
		x:2
		y:2
		disabled:false
		width: 70
		value: ${ (currDate.time - this.birhtDate.time) / (1000 * 60 * 60 * 24) }
		folder: personal
	}
	
	Double altura "Altura"{
		x:1
		y:3
		colspan: 2
		width: 40
		value: ${this.altura == null ? 1.80 : this.altura}
		folder: personal
	}

	String sexo "Sexo"{
		x:1
		y:4
		presentation_type: combo
		validValues: ["Masculino", "Feminino"]
		folder: personal
		width: 100
	}
	
	String street "Street"{
		x:1
		y:1
		parent_group: address
	}
	
	String cidade "Cidade"{
		x:1
		y:2
		presentation_type: combo
		content: LoadCidades
		parent_group: address
	}
	
	
	String telefone "Telefone"{
		x:1
		y:1
		mask: "(##) ####-####"
		folder: contacts
	}
	
	Double salario "Rendimento"{
		x:1
		y:1
		mask: "#,###.#0"
		width: 160
		folder: financial
	}
	

	
	String edition "Edition"{
		x:1
		y:2
		visibleInEdition: true
		visibleInGrid: false
		folder: financial
	}
	
	String grid "Grid"{
		x:1
		y:3
		visibleInEdition: false
		visibleInGrid: true
		folder: financial
	}
	
	
	String none "None"{
		x:1
		y:4
		visibleInEdition: false
		visibleInGrid: false
		folder: financial
	}
	

	operation groovy LoadCidades "Carregar Cidades"{
		file: br/com/maisha/wind/sample/basic/rule/LoadCidades.groovy
		validate: false
		visible: false
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