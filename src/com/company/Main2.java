package com.company;

public class Main2 {
	public static void main(String... args) {
		String name = "ABC";
		String aName = "ABC";
		String bName = "ABC";

		System.out.println(name == aName);

		Student s1 = new Student("A", 10);
		Student s2 = new Student("B", 20);

		s1.setAge(1);
		System.out.println(s2.getAge());
	}
}
