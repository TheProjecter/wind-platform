package com.progonos.portal.domain

domain_object Funcionario "Funcionario" {


String nome "Nome"{
x: 1
y: 1
width: 150
}

operation groovy Save "Salvar"{
file: SalvarFuncionario.groovy
icon: save.gif
}

}