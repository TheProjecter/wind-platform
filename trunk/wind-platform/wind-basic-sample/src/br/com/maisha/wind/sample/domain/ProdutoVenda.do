package br.com.maisha.wind.sample.domain

import br.com.maisha.wind.sample.product.domain.Product
import br.com.maisha.wind.sample.domain.Venda

domain_object ProdutoVenda "Produto Venda"{

	Product produto "Produto"{
		x:1
		y:1
		presentation_type: related using ["name"]
		manytoone: fk_prod
		content: LoadProdutos
	}
	
	Integer qtde "Quantidade"{
		x:2
		y:1
	}	
	
	Venda venda "Venda"{
		x: 1
		y: 2
		manytoone: fk_venda
		visibleInEdition: false
		visibleInGrid: false
	}

	operation groovy LoadProdutos "LoadProdutos"{
		file: br/com/maisha/wind/sample/product/rule/LoadProdutos.groovy
		validate: false
		visible: false
	}

}