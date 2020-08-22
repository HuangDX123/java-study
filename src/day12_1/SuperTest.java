package day12_1;

/*
    super关键字的使用
    1.super理解为：父类的
    2.super可以用来调用

    3.super的使用

    super可用于访问父类中定义的属性
    super可用于调用父类中定义的成员方法
    super可用于在子类构造器中调用父类的构造器

    尤其当子父类出现同名成员时，可以用super表明调用的是父类中的成员
    super的追溯不仅限于直接父类
    super和this的用法相像，this代表本类对象的引用，super代表父类的内存 空间的标识


 */


public class SuperTest {


    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
