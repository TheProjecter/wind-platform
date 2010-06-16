package com.progonos.portal.domain

domain_object Configuracoes "Configuracoes" {

String reportMail "E-mail para Relatorio"{
x: 1
y: 1
width: 150
required:true
}

operation groovy Save "Salvar"{
file: SalvarConfiguracoes.groovy
icon: save.gif
}

}