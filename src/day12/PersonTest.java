package day12;
/*
   方法重写 voerride/overwrite
   1. 子类重写的方法必须和父类被重写的方法具有相同的方法名称、参数列表
   2. 子类重写的方法的返回值类型不能大于父类被重写的方法的返回值类型
   3. 子类重写的方法使用的访问权限不能小于父类被重写的方法的访问权限
    子类不能重写父类中声明为private权限的方法
   4. 子类方法抛出的异常不能大于父类被重写方法的异常


 */


import day12_1.Student;

public class PersonTest {

    public static void main(String[] args) {


        day12_1.Student s = new Student();
        s.eat();
//        s.walk(10);


        s.study();







    }
}