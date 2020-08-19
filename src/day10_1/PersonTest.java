package day10_1;
/*
	类的结构之三，构造器（或构造方法、constructor）的使用
	construct、建设、建造、construction:CCB  constructor:建设者

	一、构造器的作用
		1.创建对象
		2.初始化对象属性

	二、说明
	1.如果没有显示式的定义内的构造器的话，则系统默认提供一个空参的构造器
	2.定义构造器的结构:权限修饰符 类名（形参列表）{}
	3.一个类中定义的多个构造器，彼此构成重载
	4.一旦我们显示的定义㐈类的构造器之后，系统就不再提供默认的空参结构器



 */

public class PersonTest {
	public static void main(String[] args) {

//		创建类的对象： new + 构造器
		Person p = new Person();

		p.eat();

		Person p1 = new Person("Tom");

		System.out.println(p1.name);

	}
}


class Person{
	//属性
	String name;
	int age;

	//构造器 \也叫做重载
	public Person(){
		System.out.println("Person() ..........");
	}
	public Person(String n){
		name = n ;
	}

	public Person(String n,int a){

	}

	//方法
	public void eat(){
		System.out.println("人吃饭");
	}


	public void study(){
		System.out.println("人学习");

	}

}