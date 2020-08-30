package day15_1;

/*
    类的内部成员之五: 内部类
    1. Java中允许将一个类A声明在另一个类B中， 则类A就是内部类， 类B称为外部类

    2.内部类的分类： 成员内部类 VS 局部内部类（方法内、代码块内、构造器内）

    3.成员内部类
        一方面 作为外部类的成员
            >调用外部类的结构
            >可以被static修饰
            >可以被4种不同的权限修饰


        另一方面 作为一个类
            >类类可以定义属性、方法、构造器
            > 可以被final修饰 标示此类不可以被继承 不使用就可以被继承
            > 可以被abstract

   4.关注的问题
    4.1如何实例化成员内部类的对象
    4.2如何在成员内部类中区分调用外部类的结构
    4.3开发中局部内的使用

 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例（静态的成员内部类）:
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例（非静态的成员内部类）
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

    }
}


class Person{

    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }

    //静态成员内部类
     static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("卡拉是狗");

        }

    }

    //非静态成员内部类
    class Bird{
        String name;


        public Bird(){

        }

        public void sing(){
            System.out.println("我是一种小小鸟");
            Person.this.eat(); //调用外部类的静态属性
        }

    }


    public void method(){

    }

}
