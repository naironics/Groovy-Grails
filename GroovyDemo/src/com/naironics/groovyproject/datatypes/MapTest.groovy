package com.naironics.groovyproject.datatypes

class MapTest {

	public static void main(args){
		Map map = [:]
		def map2 = ["Jack":"Welch", "Warren":"Buffet"]
		println map2["Jack"]
		map2["Thomas"]= "Friedman"
		println map2["Thomas"]
	}
}
