package day15;

/*
    abstract关键字的使用
     1.abstract的抽象
     2.abstract可以用来继续是结构：类、方法
     3.抽象类不能被实例化。抽象类是用来被继承的，抽象类的子类必须重
       写父类的抽象方法，并提供方法体。若没有重写全部的抽象方法，仍为抽象类。

       开发中 都会提供抽象类的子类   让子类对象实例化

     4.含有抽象方法的类必须被声明为抽象类。

     不能用abstract修饰变量、代码块、构造器;
     不能用abstract修饰私有方法、静态方法、final的方法、final的类。









     抽象方法
     只有方法声明 没有方法体
     包含抽象方法的类 一定是一个抽象类，反之 抽象类中可以没有抽象方法的。
     若子类没有重写了父类中的所有抽象方法， 则此子类 也是一个抽象类 需要使用abstract来修饰

 */

import day11.Creeture;

public class AbstractTest {
    public static void main(String[] args) {

//            一旦Person类抽象了，就不可以实例化
//        Person p1 = new Person();
//        p1.eat();

    }

}
abstract class  Creature{
    public  abstract  void breath();
}

abstract class Person extends Creeture {
    String name;
    int age;


    public Person() {

    }

    public Person(String name, int age) {

    }



    //抽象方法
//    public abstract void eat(){
//    }





    public void walk(){
        System.out.println("人走路");
    }
}

class  Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void breath(){
        System.out.println("学生应该呼吸新鲜的空气");
    }
}