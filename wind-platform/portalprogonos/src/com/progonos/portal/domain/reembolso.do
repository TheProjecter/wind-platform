package com.progonos.portal.domain

import com.progonos.portal.domain.Funcionario
import com.progonos.portal.domain.ItemReembolso

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
visible: false
}

ItemReembolso item "Item"{
x: 1
y: 4  
onetomany: reembolso
presentation_type: embedded_object
}

operation groovy Save "Salvar Reembolso"{
file: SalvarReembolso.groovy
icon: save.gif
}

operation groovy Close "Fechar Reembolso"{
file: FecharReembolso.groovy
}

}