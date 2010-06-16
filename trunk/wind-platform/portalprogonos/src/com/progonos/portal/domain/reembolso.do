package com.progonos.portal.domain

import com.progonos.portal.domain.Funcionario

domain_object Reembolso "Reembolso" {

Date data "Data"{
x: 1
y: 1
width: 120
presentation_type: date
required: true
}

Funcionario funcionario "Funcionario"{
x: 1
y: 2
width: 250
manytoone: fk_funcionario
presentation_type: related
required: true
}

String observacoes "Observacoes"{
x: 1
y: 3
presentation_type: textarea
width: 300
height: 80
}

Boolean fechado "Fechado"{
x: 1
y: 4
visible: false
}

operation groovy Save "Salvar"{
file: SalvarReembolso.groovy
icon: save.gif
}

operation groovy Close "Fechar"{
file: FecharReembolso.groovy
}

}