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

    6. Java类可以实现多个接口 ————>弥补了Java单继承的局限性
    格式 class AA extends BB implements CC,DD,EE

    7. 接口与接口之间可以继承 而且可以多继承


      继承是一个"是不是"的关系，而接口实现则是 "能不能" 的关系。

      接口的本质是契约，标准，规范，就像我们的法律一样。制定好后大家都 要遵守。


      8 接口的具体使用、体现多态性
      9. 接口、实际上可以看做是一种规范


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

abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

class Bullet extends Object implements Flyable{



    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}
//********************************************************


