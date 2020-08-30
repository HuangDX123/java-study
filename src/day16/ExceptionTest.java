package day16;

import java.util.Scanner;

/*
    1.异常的体系结构

    java.lang.Throwable
        ---------java.lang.Error:一般不编写针对性的代码进行处理。
        ---------java.lang.Exception:可以进行异常的处理
            ------------编译时异常（checked）
                    ----------IOException
                           -----------FileNotFoundException
                    ----------ClassNotFoundException 应用程序试图加载类时，找不到相应的类，抛出该异常。
            ------------运行异常（unchecked）
                    ------------NullPointerException	当应用程序试图在需要对象的地方使用 null 时，抛出该异常
                    ------------ArrayIndexOutOfBoundsException	用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
                    ------------ClassCastException	当试图将对象强制转换为不是实例的子类时，抛出该异常。
                    ------------NumberFormatException	当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常
                    ------------InputMismatchException
                    ------------ArithmeticException	当出现异常的运算条件时，抛出此异常。例如，一个整数"除以零"时，抛出此类的一个实例。








 */
public class ExceptionTest {

    //***************************************运编译时异常****************************

//    public void test7(){
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//
//        int data = fis.read();
//        while (data != -1){
//            System.out.println((char)data);
//            data = fis.read();
//        }
//
//        fis.close();
//
//    }


    //***************************************运行时异常****************************


    //ArithmeticException
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }


    //InputMismatchException
    public void test5(){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);

        scanner.close();
    }

    //NumberFormatException
    public void test4(){

        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    //ClassCastException
    public void test3(){
//        Object obj = new Date();
//        String str = (String)obj;
    }


    public void test2(){
        //ArrayIndexOutOfBoundsException
//        int[] arr = new int[10];
//        System.out.println(arr[10]);

        String str = "abc";
        System.out.println(str.charAt(3));
    }








    //NullPointerException

    public void test1(){

        int[] arr = null;
        System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }
}
