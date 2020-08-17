package com.company;

public class ObjectDemo {
	public static void main(String[] args) {
		Person person = new Person("A", 10, "B");

		person.setAge(12);
		person.setName("Test");
		System.out.println("成功");
	}
}
