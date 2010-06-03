package br.com.maisha.preferences.domain


domain_object preferences "Preferences" {


String locale "Locale"{
x: 1
y: 1
width: 120
required:true
}

Integer maxResultsDisplayed "Max Results to Display"{
x: 1
y: 2
width: 80
required:true
}


operation groovy Save "Save"{
file: SavePreferences.groovy
}


}