package com.company;

/*
 *类中方法的声明和使用
 *
 *  方法：描述应该具有的功能。
 * 比如：Math类：sqrt()\random()\...
 *      Scanner类：nextXxx()...
 *      Arrays类：sort()\binarySearch() \ tostring() \ equals()...
 *
 *1.举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 *public String getNation(String nation){}
 *
 * 2.   方法的声明：权限修饰符 返回值类型 方法名（型参列表）{
 *                       方法体
 *                }
 *      注意：static、final、abstract 来修饰的方法，后面再讲
 * 3.   说明：
 *         3.1关于权限修饰符：默认方法的权限修饰符先都使用public
 *              Java规定的4种权限修饰符：private、oublic、缺省、protected ——————>封装性在细分
 *
 *          3.2返回值类型：有返回值 VS 没有返回值
 *              3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中需要使用
 *                      return关键字来返回指定类型的变量或者常量，"return 数据"。
 *                      如果方法设有返回值，则方法声明时，使用void来标示。通常，没有返回值的方法中，就不显示
 *                      使用return，但是，如果使用的话，只能"return；"标示结束此方法的意思。
 *              3.2.2 我们定义的方法该不该有返回值？
 *                    1 题目要求
 *                    2

 * return关键字的使用。
 *
 *

 */
class CustomerTest {

}

class Customer {

	//    属性
	String name;
	int age;
	boolean isMale;

	//	   方法
	public void eat() {
		System.out.println("客服吃饭");
		return;
//		return后不可以声明表达式
	}

	public void sleep(int hour) {
		System.out.println("休息了" + hour + "个小时");
	}

	public String getName() {
		return name;
	}

	public String getNation(String nation) {
		String info = "我的国籍是：" + nation;
		return info;

	}

}