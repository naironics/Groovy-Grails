package com.naironics.groovyproject.loops

class PrintLoop {
	
	public static void main(def args){
		def list = ["Larry" , "Elon" , "Mark"]
		
		// using a variable assignment
		list.each{firstName -> 
			println firstName
		}
		// using the it variable
		list.each{println it}
	}

}
