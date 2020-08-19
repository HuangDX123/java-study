package day10;

import day9.PassObject;

/*
	在PersonTest类中实例化Person类的对象b，调用setAge()和 getAge()方法，
	体会Java的封装性。
 */
public class PersonTest {


	public static void main(String[] args) {
		Person p1 = new Person();

//		p1.age = 1;编译不通过

//		p1.setAge(12);

		System.out.println("姓名：" + p1.getName() + "\t" + "年龄为：" + p1.getAge());
		System.out.println("*****************************************");
		Person p2 = new Person("Tom",25);
		System.out.println("name: " + p2.getName() + "\t" + "age: " + p2.getAge());

	}
}

