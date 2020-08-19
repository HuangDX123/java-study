package day10_1;

import day10.Order;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();

		order.orderPulic = 2;

		//出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;
		//出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3;

		order.methodPublic();

		//出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault();
		//出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();


	}

}
