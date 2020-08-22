package day12_3;
//多态性的使用举例一：

import java.sql.Connection;

public class AnimalTest {

    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());


    }

    public void func(Animal animal){ //Animal animal = new Dog();
        animal.eat();
        animal.shout();
    }

    public void func(Dog dog){
        dog.eat();
        dog.shout();
    }

    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }

}




class Animal{

    public void eat(){
        System.out.println("动物进食");
    }

    public void shout(){
        System.out.println("动物,叫");
    }

}

class Dog extends Animal{

    public void eat(){
        System.out.println("狗吃狗粮");
    }

    public void shout(){
        System.out.println("汪汪汪！");
    }

}

class Cat extends Animal{

    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shout(){
        System.out.println("喵喵！瞄！");
    }
}









//举例二：

class Order{

    public  void method(Object obj){

    }

}

//举例三：

class Driver{

    public void doData(Connection conn){  //conn = new MySQLConnection()
        //规范的步骤去操作数据
//        conn.method1();
//        conn.method2();
//        conn.method3();

    }
}

