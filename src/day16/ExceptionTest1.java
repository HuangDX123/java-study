package day16;

/*
     一、异常的处理 ：抓抛模型

    过程一：抛  程序正在执行的过程中 一旦出现异常 就会在异常代码处生成一个队异常类的处理
                并将此对象抛出
                一旦抛出对象以后 其他的代码就不再执行

     过程二： 抓  可以理解为异常的处理方式 1 try-catch-finally  2 throws



     二、try-catch-finally的使用



     try{
        //可能出现异常的代码

     }catch(异常类型1 变量名1){
        //处理异常方式1
     }catch(异常类型2 变量名2{
        //处理异常方式2
     }catch(异常类型3 变量名3){
        //处理异常方式3
     }catch(异常类型4 变量名4){
        //处理异常方式4
     }
.........
finally{
}
 */


public class ExceptionTest1 {


    public void test1(){

        String str = "123";
        str = "abc";
        try{
            int num = Integer.parseInt(str);

            System.out.println("hello-----------1");
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常了，不要着急");
        }
        System.out.println("hello-----------2");

    }
}

