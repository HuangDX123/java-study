package day12;

/*
 *
 * 方法的重写
 *
 */

public class Person {
    String name;
    int age;
    public Person(){

    }

    public Person(System name,int age){

    }

    public void eat(){
        System.out.println("吃");
    }


    public void walk(int distance){
        System.out.println("走路,走路走的距离是：" +distance+"公里");
    }
}
