package day14;

/*
    static关键字的使用

    1.static：静态的
    2.static可以用来修饰：属性、方法、代码块、内部类

    3.使用static修饰属性：静态变量
               3.1 属性：按是否使用static修饰，又分为：静态属性  Vs 非静态属性（实例变量 ）
                实例变量： 我们创建了类额多个对象， 每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象中的
                     非静态属性时，不会导致其他对象中同样的属性值的修改。
                静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致
                        其他对象调用此静态变量的时候，是修改过了的变量
                3.2 static修饰属性的其他说明：
                    1 静态变量随着类的加载而加载。可以通过类.静态变量的方法进行调用
                    2 静态变量的加载要早于对象的创建。
                    3 由于类只会加载一次，则静态变量也只会存在一份

                    4        类变量         实例变量
                    类        yes            no
                    对象       yes           yes


    4.使用static修饰方法：
        随着类的加载而加载 可以通过 类.属性方法 的方式进行调用

                             静态方法        非静态方法
                    类        yes            no
                    对象       yes           yes



 */

public class StaticTest {
    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";


        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;

        c2.nation = "CHINA";

        System.out.println(c2.nation);


        //编译不通过
//        Chinese.name = "张继科";
        c1.eat();

        Chinese.show();
//        Chinese.eat();     不可以调用非静态方法


    }

}

class Chinese {

    static String nation;
    String name;
    int age;

    public static void show() {
        System.out.println("我是一个中国人");
    }

    public void eat() {
        System.out.println("中国人吃中餐");

    }

}

