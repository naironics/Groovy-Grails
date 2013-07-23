package com.naironics.groovyproject.datatypes

class ListMapTest {

	public static void main(args){
		
		List<Integer> list = [1,2,3,4]
		println list[0]
		println list[1]
		println list[2]
		println list[3]
		
		List<Person> persons = list[]
		Person p = new Person ("Groovy", "Grails")
		persons[0] = p
		println persons.size()
		println persons[0].firstName
		println persons.get(0).firstName
	}
}
