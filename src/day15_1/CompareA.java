package day15_1;

/*
 JDK 8:除了定义全局变量和抽象方法之外

 */

public interface CompareA {


    //  静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }
    //  默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }

//    default void method3(){
//        System.out.println("CompareA:北京");
//    }

    default void method3(){
        System.out.println("CompareA:上海");
    }


}
