package day13_2;

/*
     Java中的JUnit单元测试

     步骤：
     1.选中当前工程 - 右键选择：build path -add libraries - JUnit 4 - 下一步
     2.创建Java类，进行单元测试。
        此时的Java类要求：1 此类是public的 2 此类提供公共的无参的构造器
     3.此类中声明单元测试方法。
        此时的单元测试方法： 方法权限就是 public，没有返回值，没有形参

     4.此单元测试方法上需要声明注解：@Test，并在单元测试类中导入 import org.junit.Test

     5.声明好单元测试方法后， 就可以在方法体内测试相关代码，
     6.写完代码以后，右键双击单元测试方法名，右键 ： run as - JUnit Test



 */

public class JUnitTest {


    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";

        System.out.println(s1.equals(s2));


        //ClassCastException的异常
//        Object obj = new String("GG");
//        Date date = (Date) obj;

    }


}
