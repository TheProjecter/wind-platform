package br.com.maisha.wind.sample.domain

import br.com.maisha.wind.sample.domain.Telefone

domain_object Funcionario "Funcionario"{

	String nome "Nome"{
		x: 1
		y: 1
		required: true
	}
	
	String email "Email"{
		x: 1
		y: 2
		required: true
	}

	Telefone telefone "Telefone"{
		x: 1
		y: 3
		visibleInEdition: true
		visibleInGrid: false
		onetomany: funcionario
		presentation_type: embedded_object
	}	
	
	operation groovy SaveFuncionario "Salvar"{
		file: br/com/maisha/wind/sample/basic/rule/SaveFuncionario.groovy
	}
	
	operation groovy FiltrarFuncionario "Filtrar"{
		file: br/com/maisha/wind/sample/basic/rule/FiltrarFuncionario.groovy
		validate: false
	}

}