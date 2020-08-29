package day15;

/*
    接口的使用
    1.接口使用interface定义
    2.Java中，接口和类是并列的俩个结构
    3.如何定义接口，定义接口中的成员

           3.1 JDK7及以前：只能定义全局常量和抽象方法
                全局常量： public static final的。但是书写时可用省略不写
                抽象方法： public abstract的

           3.2  JDK8： c=除了定义全局常量和抽象方法之外：还可以定义静态方法、默认方法（略）

    4.接口中不能定义构造器 意味着接口不能实例化

    5. Java开发中 接口通过让类去实现（implements）的方式来使用
        如果实现类覆盖了接口中的所有抽象方法 则此实现类就可以实例化
        如果实现类没有覆盖接口中的所有抽象方法 则此实现类仍然为一个抽象类


 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        //Flyable.MIN_SPEED = 2;

    }
}




interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; //省略了public static final


    //抽象方法
    public abstract void fly();
    // 省略了public abstract
    void stop();


}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速");
    }
}

class Kite implements Flyable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}