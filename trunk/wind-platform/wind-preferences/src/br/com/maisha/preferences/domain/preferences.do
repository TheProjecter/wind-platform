package br.com.maisha.preferences.domain


domain_object preferences "Preferences" {

	open_filtering: true
	event_handler: br/com/maisha/preferences/handler/PreferencesEventHandler.groovy

	String locale "Locale"{
		x: 1
		y: 1
		width: 120
		required:true
		presentation_type: combo
		validValues: ["pt_BR", "en_US"]
	}
	
	Integer maxResultsDisplayed "Max Results to Display"{
		x: 1
		y: 2
		width: 80
		required:true
	}
	
	String datePattern "Date Pattern"{
		x: 1
		y: 3
		width: 80
		required:true
	}
	
	operation groovy Save "Save"{
		file: br/com/maisha/preferences/rules/SavePreferences.groovy
		icon: icon/save.gif
		tooltip: wind.preferences.action.tooltip.save
	}
	
	operation groovy FilterPreferences "Filter"{
		file: br/com/maisha/preferences/rules/FilterPreferences.groovy
		icon: icon/filter.gif
		tooltip: wind.preferences.action.tooltip.filter
		is_filter: true
		validate: false
	}


}