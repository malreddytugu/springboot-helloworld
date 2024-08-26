package com.javalearning.springboot.helloworld.utils;

public class Student {
	private Address address;

    public Student(Address address){
        this.address = address;
    }

	public void print() {
		System.out.println(" Student class print method is called");
		address.print();
	}
	

    public void init(){
        System.out.println("Intialization logic");
    }

    public void destroy(){
        System.out.println("Destruction logic");
    }
}
