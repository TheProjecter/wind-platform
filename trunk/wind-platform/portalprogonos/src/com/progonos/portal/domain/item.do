package com.progonos.portal.domain

import com.progonos.portal.domain.Reembolso

domain_object ItemReembolso "Item Reembolso" {


String descricao "Descricao"{
x: 1
y: 1
width: 250
}

Double valor "Valor"{
x: 1
y: 2
width: 120
}

Date date "Data"{
x: 1
y: 3
width: 120
presentation_type:date
}

Reembolso reembolso "Reembolso"{
x: 1
y: 4
visible: false
manytoone: fk_reembolso
}

}