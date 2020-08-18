package day9;

/*

	关于变量的赋值
	形参是基本数据类型:将实参基本数据类型变量的“数据值”传递给形参
	形参是引用数据类型:将实参引用数据类型变量的“地址值”传递给形参

 */

public class ValueTransferTest {


	public static void main(String[] args) {

		System.out.println("*************基本数据类型**************");

		int m = 10;
		int n = m;

		System.out.println("m = " + m + ",n =" + n);

		n = 20;

		System.out.println("m = " + m + ",n =" + n);
		System.out.println("*************引用数据类型**************");

		Order o1 = new Order();
		o1.orderId = 1001;

		Order o2 = o1; //赋值以后o1和o2的地址值相同，都指向了堆空间中同一个对象实体。
		System.out.println("o1.orderId = " + o1.orderId + "o2.orderId = " + o2.orderId);
		o2.orderId = 1002;
		System.out.println("o1.orderId = " + o1.orderId + "o2.orderId = " + o2.orderId);

	}
}


class Order {
	int orderId;


}