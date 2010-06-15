package com.progonos.portal.domain

domain_object Funcionario "Funcionario" {


String nome "Nome"{
x: 1
y: 1
width: 150
toString: true
}

String telefone "Telefone"{
x: 1
y: 2
width: 150
}

String email "Email"{
x: 1
y: 3
width: 250
}

Date dataNascimento "Data de Nascimento"{
x: 1
y: 4
width: 80
presentation_type:date
}

operation groovy Save "Salvar"{
file: SalvarFuncionario.groovy
icon: save.gif
}

}