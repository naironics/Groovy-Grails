package com.naironics.groovyproject.test

class ClosureTest{
  public static void main(args){
    List<Integer> list = [5,6,7,8]
    list.each({line -> println line})
    list.each({println it})
  }
} 