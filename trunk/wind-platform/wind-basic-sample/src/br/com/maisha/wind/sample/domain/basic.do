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
		value: ${this.birhtDate == null ? currDate : this.birhtDate}
	}
	
	Integer age "Dias de Vida"{
		x:2
		y:2
		disabled:false
		width: 70
		value: ${ (currDate.time - this.birhtDate.time) / (1000 * 60 * 60 * 24) }
	}
	
	Double altura "Altura"{
		x:1
		y:3
		colspan: 2
		width: 40
		value: ${this.altura == null ? 1.80 : this.altura}
	}

	String sexo "Sexo"{
		x:1
		y:4
		presentation_type: combo
		validValues: ["Masculino", "Feminino"]
	}
	
	String telefone "Telefone"{
		x:1
		y:5
		mask: "(##) ####-####"
	}
	
	Double salario "Rendimento"{
		x:1
		y:6
		mask: "#,###.#0"
		width: 160
	}
	
	String cidade "Cidade"{
		x:1
		y:7
		presentation_type: combo
		content: LoadCidades
	}

	operation groovy LoadCidades "Carregar Cidades"{
		file: br/com/maisha/wind/sample/basic/rule/LoadCidades.groovy
		validate: false
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