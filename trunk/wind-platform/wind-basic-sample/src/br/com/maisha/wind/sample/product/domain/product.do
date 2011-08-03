package br.com.maisha.wind.sample.product.domain

import br.com.maisha.wind.sample.product.domain.Category

domain_object Product "Product"{

	open_filtering: true

	String name "Name"{
		x: 1
		y: 1
		width: 500
		required: true
	}
	
	Boolean active "Active"{
		x: 2
		y: 1
		width: 70
		presentation_type: checkbox
		value: ${true}
		visibleInGrid: false
	}
	
	Group codes "Codes"{
		x: 3
		y: 1
		presentation_type: group
	}
	
	String refCode "Reference"{
		x: 1
		y: 1
		width: 110
		parent_group: codes
	}
	
	String ean13 "EAN13"{
		x: 1
		y: 2
		width: 110
		parent_group: codes
		visibleInGrid: false
	}	
	
	

	

	
	folder info "Information"{
		sequence: 1
		visible: true
	}
	
	Category category "Category"{
		x: 1
		y: 1
		folder: info
		colspan: 2
		presentation_type: related using ["ref", "name"]
		required: true
		manytoone: fk_category
		visibleInGrid: false
		content: LoadCategory
	}
	
	Group prices "Base Prices"{
		x: 1
		y: 2
		presentation_type: group
		folder: info
	}
	
	Double costPrice "Cost Price"{
		x: 1
		y: 1
		width: 120
		mask: "#,###.#0"
		parent_group: prices
	}
	
	Double salePrice "Sale Price"{
		x: 1
		y: 2
		width: 120
		mask: "#,###.#0"
		parent_group: prices
	}
	
	
	Group stock "Stocks"{
		x: 2
		y: 2
		presentation_type: group
		folder: info
	}
	
	Double realStock "Real Stock"{
		x: 1
		y: 1
		parent_group: stock
		width: 110
	}
	
	Double virtualStock "Virtual Stock"{
		x: 1
		y: 2
		parent_group: stock
		width: 110
	}	
	
	
	Group weights "Weights"{
		x: 1
		y: 3
		colspan: 2
		presentation_type: group
		folder: info
	}
	
	Double volume "Volume"{
		x: 1
		y: 1
		mask: "#,###.#0"
		parent_group: weights
		visibleInGrid: false
		width: 110
	}
	
	Double grossWeight "Gross Weight"{
		x: 1
		y: 2
		mask: "#,###.#0"
		parent_group: weights
		visibleInGrid: false
		width: 110
	}
	
	Double netWeight "Net Weight"{
		x: 1
		y: 3
		mask: "#,###.#0"
		parent_group: weights
		visibleInGrid: false
		width: 110
	}
	
	folder descr "Descriptions"{
		sequence: 2
		visible: true
	}
	
	String description "Description"{
		x: 1
		y: 1
		presentation_type: textarea
		height: 50
		width: 500
		folder: descr
		visibleInGrid: false
	}
	
	String prchsDescription "Purchase Description"{
		x: 1
		y: 2
		presentation_type: textarea
		height: 50
		width: 500
		folder: descr
		visibleInGrid: false
	}
	
	String slsDescription "Sale Description"{
		x: 1
		y: 3
		presentation_type: textarea
		height: 50
		width: 500
		folder: descr
		visibleInGrid: false
	}	
	
	
	operation groovy LoadCategory "LoadCategory"{
		file: br/com/maisha/wind/sample/basic/rule/LoadCategory.groovy
		validate: false
		visible: false
	}
	
	operation groovy FilterProduct "Filtrar"{
		file: br/com/maisha/wind/sample/basic/rule/FilterProduct.groovy
		validate: false
		is_filter:true
	}

	operation groovy SaveProduct "Salvar"{
		file: br/com/maisha/wind/sample/basic/rule/SaveProduct.groovy
	}

}