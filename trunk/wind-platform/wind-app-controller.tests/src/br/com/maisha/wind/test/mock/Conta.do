package br.com.maisha.wind.test.mock

import br.com.maisha.wind.finance.domain.Lancamento

domain_object Conta "Conta"{

	String nome "Nome"{
		x: 1
		y: 1
		required:true
		width: 340
	}
	
	String tipo "Tipo"{
		x: 1
		y: 2
		presentation_type: combo
		validValues: ["Credito", "Debito"]
		width: 120
	}
	
	Double saldo "Saldo"{
		x: 1
		y: 3
		required: true
		width: 120
		mask: "#,###.#0"
	}
	

	
	operation groovy SaveConta "Salvar"{
		file: br.com.maisha.wind.test.mock.SaveConta
	}
	
	operation groovy DeleteConta "Remover"{
		file: br.com.maisha.wind.test.mock.DeleteConta
	}
	
	operation groovy UsesOfMessageAPI "Messages Demo"{
		file: br.com.maisha.wind.test.mock.UsesOfMessageAPI
	}
}