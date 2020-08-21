package day12;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        order.orderProtected =2;
        order.orderDefault =4;


        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

//            不同包
//        order.orderPrivate =4;
//        order.methodPrivate();
    }
}
