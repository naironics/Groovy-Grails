package com.naironics.groovyproject

class Hello {
	
	static sum(a,b,c=0){
		a+b+c
	}
	
	static void main(args){
		println sum(7,9)
		println sum(11,14,8)
	}

}
