package com.progonos.portal.domain

domain_object reembolso "Reembolso" {

Date data "Data"{
x: 1
y: 1
width: 100
height: 20
presentation_type: date
}

String observacoes "Observacoes"{
x: 1
y: 2
presentation_type: textarea
width: 300
height: 80
}

operation groovy Save "Salvar"{
file: SalvarReembolso.groovy
icon: save.gif
}

}