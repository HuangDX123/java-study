package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    异常处理的方式二   throws + 异常类型

    1. 如果一个方法(中的语句执行时)可能生成某种异常，但是并不能确定如何处理这 种异常，则此方法应显示地声明抛出异常，表明该方法将不对这些异常进行处理， 而由该方法的调用者负责处理。
    2. 在方法声明中用throws语句可以声明抛出异常的列表，throws后面的异常类型可 以是方法中产生的异常类型，也可以是它的父类。


    3.开发中如何选择使用try-catch-finally   还是使用throws?
    如果父类中被重写的方法没有throws 方式处理异常 则子类重写的方法也不能使用throws 意味着如果子类重写的方法中又异常 必须使用 try-catch-finally的方式处理

 */
public class ExceptionTest2 {
    public static void main(String[] args) {
    try{
        method2();

    }catch (IOException e){
        e.printStackTrace();
    }



    }

    public static void method2() throws FileNotFoundException, IOException {
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
    }







}
