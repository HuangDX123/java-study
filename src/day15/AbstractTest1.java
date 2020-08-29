package day15;
/*
    abstract 使用上的注意点
    1.abstract不能用来修饰：属性、构造器等结构

    2.abstract不能用来修饰私有的方法、静态方法、final的方法、


 */

public class AbstractTest1 {

    static abstract class A {
        abstract void m1();

        public void m2() {
//        抽象类举例
            System.out.println("A类中定义的m2方法");
        }
    }



    static class B extends A {
        void m1() {
            System.out.println("B类中定义的m1方法");
        }
    }
    public static class Test {
        public static void main(String args[]) {
            A a= new B();
            a.m1(); a.m2();

        }
    }


}

