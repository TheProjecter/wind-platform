package br.com.maisha.wind.sample.domain

domain_object funcionario "Funcionario"{

	String nome "Nome"{
		x: 1
		y: 1
		required: true
		colspan: 2
	}
	
	String email "Email"{
		x: 1
		y: 2
		required: true
		colspan: 2
	}
	
	String telefone "Telefone"{
		x: 1
		y: 3
		mask: "(##) ####-####"
		width: 110	
	}
	
	String celular "Celular"{
		x: 2
		y: 3
		mask: "(##) ####-####"
		width: 110
	}
	
	
	operation groovy SaveFuncionario "Salvar"{
		file: br/com/maisha/wind/sample/basic/rule/SaveFuncionario.groovy
	}

}