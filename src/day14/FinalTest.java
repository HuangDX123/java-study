package day14;


/*
    关键字:final

    在Java中声明类、变量和方法时，可使用关键字final来修饰,表示“最终的”

    final标记的类不能被继承。提高安全性，提高程序的可读性。
    String类、System类、StringBuffer类

    final标记的方法不能被子类重写。
    比如:Object类中的getClass()。

    final标记的变量(成员变量或局部变量)即称为常量。名称大写，且只 能被赋值一次。

    final 不能被继承 不可以被重写


 */
public class FinalTest {

    final int WIDTH = 10;
    final int LEFT;
    final int RIGHT;
    {

        LEFT = 1;
    }
    public FinalTest(){
        RIGHT = 2;
    }

    public FinalTest(int n){
        RIGHT = n ;

    }

    public  void dowidth(){
//        width = 20;
    }






    public  void show(){
        final int NUM = 10;//常量

    }

    public  void show(final  int num){


        System.out.println(num);

    }

    public static void main(String[] args) {

        int num = 10;

        num = num + 5;

        FinalTest test = new FinalTest();

        test.show(10);
    }


}


final class FinalA {

}


//. final修饰方法
//class A {
//    public final void print() {
//        System.out.println("A");
//    }
//}
//
//class B extends A {
//    public void print() { // 错误，不能被重写。
//        System.out.println("尚硅谷");
//    }
//}


// final修饰变量——常量
class A {
    private final String INFO = "atguigu"; //声明常量

    public void print() {
//The final field A.INFO cannot be assigned //INFO = "尚硅谷";
    }
}









////关键字final应用举例
//
//public final class Test {
//    public static int totalNumber = 5;
//    public final int ID;
//
//    public Test() {
//        ID = ++totalNumber; // 可在构造器中给final修饰的“变量”赋值
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.ID);
//        final int I = 10;
//    }
//}