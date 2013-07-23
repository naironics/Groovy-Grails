package com.naironics.groovyproject

class Person {
	
	String firstName
	String lastName
	int age
	def address
	
	static void main(def args){
		Person p = new Person()
		p.setFirstName("Marcus")
		p.lastName = "Trescothick"
		p.address = ("My Address")
		
		println (p.firstName + " " + p.lastName)
		
		p = new Person(firstName: "Larry", lastName: "Page")
		
		println (p.firstName + " " + p.lastName)
	}

}
