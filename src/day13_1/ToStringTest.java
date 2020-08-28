package day13_1;

/*
    toString()方法在Object类中定义

    1.当我们输出一个对象的应用时，实际上就是调用了当前对象的toString（）


    2.可以根据需要在用户自定义类型中重写toString()方法 如String 类重写了toString()方法，返回字符串的值。
    s1=“hello”; System.out.println(s1);//相当于System.out.println(s1.toString());

    3.像String、Date、File、包装类等都重写了Object类中的toString()方法
    使得在调用对象的toString()时，返回"实体内容" 信息

    4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
 */
public class ToStringTest {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());
        System.out.println(cust1);
    }
}
