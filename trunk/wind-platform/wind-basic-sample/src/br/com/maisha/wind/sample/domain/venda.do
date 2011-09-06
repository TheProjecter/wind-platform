package br.com.maisha.wind.sample.domain

import br.com.maisha.wind.sample.domain.Funcionario
import br.com.maisha.wind.sample.domain.ProdutoVenda

domain_object Venda "Venda"{


	Funcionario funcionario "Funcionario"{
		x: 1
		y: 1
		visibleInEdition: true
		visibleInGrid: true
		presentation_type: related using ["nome"]
		manytoone: fk_func
		content: FiltrarFuncionario
	}

	ProdutoVenda produtos "Produtos"{
		x: 1
		y: 2
		visibleInEdition: true
		visibleInGrid: false
		presentation_type: embedded_object
		onetomany: venda
	}
	

	
	operation groovy SaveVenda "Finalizar Venda"{
		file: br/com/maisha/wind/sample/product/rule/SaveVenda.groovy
	}
	
	operation groovy FiltrarFuncionario "Filtrar"{
		file: br/com/maisha/wind/sample/basic/rule/FiltrarFuncionario.groovy
		validate: false
		visible: false
	}
	

}