package br.com.maisha.wind.sample.domain

import br.com.maisha.wind.sample.domain.Funcionario

domain_object Telefone "Telefone"{


	String tipo "Tipo"{
		x: 1
		y: 1
		validValues: ["Celular", "Residencial", "Comercial"]
		presentation_type: combo
		width: 100
	}
	
	
	String numero "Numero"{
		x:2
		y:1
		mask: "(##) ####-####"
	}
	
	
	Funcionario funcionario "Funcionario"{
		x: 1
		y: 2
		manytoone: fk_func
		visibleInEdition: false
		visibleInGrid: false
	}

}