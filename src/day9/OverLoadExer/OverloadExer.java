package day9.OverLoadExer;
/*
	1.编写程序，定义三个重载方法并调用。方法名为mOl.
	  三个方法分别接收一个int参数、两个int参数、一个字符串参数。
	  分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
	  在主类main（）方法中分别调用参数区别调用三个方法。

	2.定义三个重载方法max(),
	第一个方法求两个int值中的最大值，
	第二个方法求出两个double值中的最大值，
	并分别调用三个方法


 */


public class OverloadExer {

	public static void main(String[] args) {
		OverloadExer test = new OverloadExer();
		test.mOl(10,50);

		
		System.out.println(test.max(50, 90));
	}

	//1.如下的三个方法构造重载
	public void mOl(int i) {
		System.out.println(i * i);
		System.out.println("使用的是第1个方法");

	}

	public void mOl(int i, int j) {
		System.out.println(i * j);
		System.out.println("使用的是第2个方法");

	}

	public void mOl(String s) {
		System.out.println(s);
		System.out.println("使用的是第3个方法");

	}

	//2.如下的三个方法构造重载
	public int max(int i, int j) {
		return (i > j) ? i : j;


	}


	public double max(double d1, double d2) {
		return (d1 > d2) ? d1 : d2;

	}

	public double max(double d1, double d2, double d3) {
		double max = (d1 > d2) ? d1 : d2;
		return (max > d3) ? max : d3;

	}

}



