package br.com.maisha.wind.sample.product.domain

import br.com.maisha.wind.sample.product.domain.Product

domain_object Category "Category"{
	
	Integer ref "Reference"{
		x: 1
		y: 1
		width: 80
	}
	
	String name "Name"{
		x: 1
		y: 2
		width: 500
		toString: true
	}
	
	Boolean active "Active"{
		x: 1
		y: 3
		presentation_type: checkbox
	}
		
	String description "Description"{
		x: 1
		y: 4
		presentation_type: textarea
		height: 50
	}

	Product product "Product"{
		x: 1
		y: 5
		visibleInEdition: false
		visibleInGrid: false
		onetomany: category
	}


	operation groovy SaveCategory "Salvar"{
		file: br/com/maisha/wind/sample/basic/rule/SaveCategory.groovy
	}

}
