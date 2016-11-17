package edu.nvcc.csc.csc200;

/*
 * 
 * date 11/17/2016
 * @author Westlein 
 * purpose: person class composes of name and age
 */
public class Person {
	private String name;
	private int age;
	
	/**
	 * construct a new person with a name = John and age = 0
	 */
	
	public Person() {
		name = "john";
		age = 0;
	}
	/**
	 * construct a new person with values provided from name and age parameters.
	 * @param name a person name
	 * @param age a persons age.
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/** 
	 * get the name of the person 
	 * @return name of a person.
	 */

	public String getName() {
			return name;
	}
	/** 
	 * set the name of the person according to name parameter.
	 * @param name name of a person
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 * get the age of the person 
	 * @return age of a person.
	 */
	public int getAge() {
		return age;
		
	}
	/** 
	 * set the age of the person according to age parameter.
	 * @param age age of a person
	 */

	public void setAge(int age) {
		this.age = age;
		
	}
	/**
	 * Return a name and age of a person.
	 */
	public String toString() {
		return "Name: " + name + " " + "Age " + age;
	}
}
