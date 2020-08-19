package day10;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();

		order.orderDefault = 1;
		order.orderPulic = 2;
		//出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3;

		order.methodDefault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();



	}
}
