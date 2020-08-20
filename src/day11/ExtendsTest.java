package day11;
/*
    面向对象特征之二:继承性(inheritance)

     继承的好处
    继承的出现减少了代码冗余，提高了代码的复用性。
    继承的出现，更有利于功能的扩展。
    继承的出现让类与类之间产生了关系，提供了多态的前提。

      为什么要继承
     此处的多个类称为子类(派生类)，单独的这个类称为父类(基类 或超类)。可以理解为:“子类 is a 父类”
        类继承语法规则: class Subclass extends SuperClass{ }


      Java只支持单继承和多层继承，不允许多重继承
        一个子类只能有一个父类
        一个父类可以派生出多个子类


       如果我们没有显示的声明一个类的父类的话，则此继承于java.lang.Object类
       所有的Java类（除Java。lang.Object类 声明的功能
 */

public class ExtendsTest {

    public static void main(String[] args) {

        Person p1 = new Person();
//        p1.age = 1;
        p1.eat();
        System.out.println("******************************");
        Student s1 = new Student();
        s1.eat();
//        s1.sleep();

        s1.name = "Tom";
        s1.setAge(10);
        System.out.println(s1.getAge());
        System.out.println("******************************");


        //间接获取到方法
        s1.breath();


        Creeture s = new Creeture();
        s.hashCode();
    }
}
