package com.atguigu;
/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 *
 *
 *
 *
 */
//测试类

public class CircleTest_2 {
	public static void main(String[] args) {

		Circle c1 = new Circle();

		c1.radius = 2.1;
		//对应方式一需要返回值
		double area = c1.findArea();
		System.out.println("圆的面积为:" + area);
	}
}


//圆
class Circle {

	//属性
	double radius;

	//求圆的面积
	//方式一（需要返回值）
	public double findArea() {
		double area = 3.14 * radius * radius;
		return area;

	}

//	 方式二：（不需要返回值）
//		public void findArea() {
//			double area = Math.PI * radius * radius;
//			System.out.println("面积为：" + area);
//		}
}