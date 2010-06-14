package com.progonos.portal.domain

import com.progonos.portal.domain.Funcionario

domain_object Reembolso "Reembolso" {

Date data "Data"{
x: 1
y: 1
width: 100
height: 20
presentation_type: date
}

String observacoes "Observacoes"{
x: 1
y: 3
presentation_type: textarea
width: 300
height: 80
}

Funcionario funcionario "Funcionario"{
x: 1
y: 2
width: 150
manytoone: fk_funcionario
presentation_type: related
}


operation groovy Save "Salvar"{
file: SalvarReembolso.groovy
icon: save.gif
}

}