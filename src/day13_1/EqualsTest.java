package day13_1;
/*
    面试题： == 和 equals()区别

    一、 回顾 == 的使用：
    ==：运算符
    1.可以使用在基本数据类型变量和引用数据类型变量中
    2.如果比较的是基本数据变量，比较两个变量保存的数据是否相等，（不一定类型要相等）
    3.如果比价的是引用的数据类型变量，比较两个变量的地址类型值是否相等，即俩个引用是否指向同一个对象实体


    二、equals()方法的使用：
    1.是一个方法，而对象




 */


public class EqualsTest {

    public EqualsTest() {
    }

    public static void main(String[] args) {

        //基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;

        System.out.println(i == j);//true
        System.out.println(i == d);//true

        boolean b = true;

        char c = 10;
        System.out.println(i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true


        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);

        System.out.println("**************************************");
        System.out.println(cust1 == cust2); //false

        String str1 = new String("atguigu");
        String str2 = new String("atguigu");

        System.out.println("**************************************");
        System.out.println(str1 == str2); //false
        System.out.println("**************************************");

        System.out.println(cust1.equals(cust2));//false


    }
}
