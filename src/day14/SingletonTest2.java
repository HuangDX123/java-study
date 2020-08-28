package day14;

/*
    单例 设计模式 懒汉式

 */

public class SingletonTest2 {
    public static void main(String[] args) {

        Order order1 = Order.getInstance();

        Order order2 = Order.getInstance();

        System.out.println(order1==order2);
    }

}


class Order{

    //1.私有化构造器
    public Order(){

    }

    //2.声明当前类对象，没有初始化
//    此对象也要声明static
    public static Order instance = null;

    //3.声明public 、static 的返回当前类对象的方法
    public static Order getInstance(){
        if (instance == null){
            instance = new Order();

        }
        return instance;
    }

}