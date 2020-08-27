package day13;

/*
    面向对象特征3 多态性

    理解多态性：一个事务的多种形态。
    何为多态性
    对象的多态性 父类的引用指向子类的对象

    多态的使用，虚拟方法调用
    有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但是在运行期，我们实际上执行的是子类重写父类的方法
    总结：编译，看左边，运行，看右边

    多态性的使用前提 ： 1.要有类的继承关系 2.要有方法的重写

    对象的多态性：只适用于方法不适用于属性
    *************************************************************************


 */

public class PersonTest {
    public static void main(String[] args) {

        day13.Person p1 = new day13.Person();
        p1.eat();

        day13.Man man = new day13.Man();
        man.eat();
//        man.age = 25;
        man.age = 25;
        man.earnMoney();


        System.out.println("*****************************************");
        //对象的多态性:父类的引用指向子类的对象
        Person p2 = new Man();
//        Person p3 = new Woman();

//        多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ----虚拟方法调用
        p2.eat();
        p2.walk();

        System.out.println("*******************************************************");
        //不能调用子类所特有的方法，编译时 ，p2 是Person类型。

        System.out.println();
        p2.name = "Tom";
//        p2.isSmoking = true;
        //有了对象的多态性以后，内存中实际上加载了子类特有的属性和方法的，但是由于变量的声明父类类型，导致
        //编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用

        //如何才能调用子类特有的属性和方法呢？
//        向下转型，使用强制类型转换符
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;


        //使用强转时，可能出现ClassCastException
//        Woman w1 = (Woman) p2;
//        w1.goShopping();



        //
        /*
           instanceof 关键字的使用

           a instanceof A:判断对象a是否是类A的实例。如果是 返回true 如果不是 返回false。

           使用情景：为了避免在向下转型时出现ClassCastException异常 我们在向下转型之前先进行
           instanceof的判断 一但返回true 就进行向下转型 如果返回false,就不进行向下转型

           如果 a instanceof A 返回true，则a instanceof B也返回true.



         */
        if (p2 instanceof Woman){
            Woman w1 =(Woman)p2;
            w1.goShopping();
            System.out.println("***********Woman**************");
        }

        if (p2 instanceof Man){
            Man m2 =(Man)p2;
            m2.earnMoney();
            System.out.println("*************Man**************");
        }

        if (p2 instanceof Person){
            System.out.println("**********Person**************");
        }

        if (p2 instanceof Object){
            System.out.println("*********Object***************");
        }


        //练习：
//        问题一 编译通过 运行不通过
//        Person p3 = new Person();
//        Man m3 =(Man)p3;

//        Person p4 = new Person();
//        Man m4 =(Man) P4;

//        问题二，编译通过运行也通过

//        Object obj = new Woman();
//        Person p = (Person)obj;

//        问题三 编译不过
//        Man m5 = new Woman();





    }
}