package com.naironics.groovyproject.datatypes

class TypesTest {
	
	public static void main(args){
		
		int i = 3 // short form for Integer i = new Integer(3)
		int j = i+3
		int k = i.plus(3) //same as above
		
		// Make sure this worked
		
		//assert(k==4)  // This do not work
		
		println i.getClass().getName()
		println j.getClass().getName()
		println k.getClass().getName()
		
		//Automatic type assignment
		
		def value = 1.0F
		println value.getClass().getName()
		def value2 = 1
		println value2.getClass().getName()
		value2 = value2 / 2
		println value2
		println value2.getClass().getName()
			
	}

}
