package day16;

/*
     一、异常的处理 ：抓抛模型

    过程一：抛  程序正在执行的过程中 一旦出现异常 就会在异常代码处生成一个队异常类的处理
                并将此对象抛出
                一旦抛出对象以后 其他的代码就不再执行


            关于异常对象的产生 系统自动生成的异常对象
                            手动的生成一个异常对象 并抛出 throw



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

说明：
1.finally是可选的
2.使用try将可能出现的代码包装起来 在执行过程中 一旦出现异常  就会生成一个对应异常类的对象，根据此对象的类型
   去catch中进行匹配
3.一旦try中的异常对象匹配到某个catch时，就会进入catch中进行异常处理  一旦处理完成以后  跳出当前的 try -catch结构  在没有写finally的情况 继续执行其后的代码
4.catch中的异常类型如果没有子父类关系 则谁声明在上 谁声明在下无所谓
   catch中的异常类型如果满足了子父类关系 则要求子类一定声明在父类的上面 否则，报错
5.常用的异常对象处理方式： 1 String getMessage() printStackTrace()
6.在try结构中声明的变量 再出了 try结构以后就不能再被调用





体会 使用try -catch - finally处理编译异常 是得程序在编译时就不再报错 但是运行时仍可能报错
    相当于我们使用 try -catch - finally 将一个编译时可能出现的异常， 延迟到运行时出现。

 */


public class ExceptionTest1 {

//    public void test2(){
//        try{
//            File file = new File("hello.txt");
//            FileInputStream fis = new FileInputStream(file);
//
//            int data = fis .read();
//            while (data != -1){
//                System.out.println((char)data);
//                data = fis.read();
//            }
//
//            fis.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }











    public void test1(){

        String str = "123";
        str = "abc";
        int num = 0;
        try{
            num = Integer.parseInt(str);

            System.out.println("hello-----------1");
        }catch (NullPointerException e){
//            System.out.println("出现空指针异常了，不要着急");

            System.out.println(e.getMessage());

            //printStackTrace();
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常了，不要着急");
        }catch (Exception e){
            System.out.println("出现异常了，不要着急");
        }
        System.out.println(num);

        System.out.println("hello-----------2");

    }
}

