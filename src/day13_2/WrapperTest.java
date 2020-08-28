package day13_2;


/*/
    Java提供了八种基本数据类型定义相应的引用类型—包装类(封装类)


 */
public class WrapperTest {

    //String 类型————>基本数据类型、包装类

    public void test5(){
        String str1 = "123";

//        错误方法
//        int num1 =(int)str1;

//        Integer in1 = (Integer)str1;
    }




    //基本数据类型、包装类 ---------> String类型

    public void test4(){

        int num1 = 10;
        //方式一：连接运算

        String str1 = num1 + "";

        //方式二: 调用String的valueOf(Xxx xxx)
        float f1 =12.3f;
        String str2 = String.valueOf(f1); //"12.3"


        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }



//    JDK 5.0新特性 自动装箱与自动拆箱

    public void test3(){
        int num1 = 10;
        //        基本数据类型 --> 包装类的对象

        method(num1);

//        自动装箱
        int num2 = 10;
        Integer in1 = num1; //自动装箱

        boolean b1 = true;
        Boolean b2 = b1; //自动装箱

        //自动拆箱 ： 包装类 -->基本数据类型
        System.out.println(in1.toString());

        int num3 = in1;

    }
    public void method(Object obj){
        System.out.println(obj);
    }


    int i = 500;
    Integer t = new Integer(i);

    String s = t.toString(); // s = “500“,t是类，有toString方法
    String s1 = Integer.toString(314); // s1= “314“ 将数字转换成字符串。
    String s2="4.56";
    double ds=Double.parseDouble(s2); //将字符串转换成数字


    //        拆箱:将数字包装类中内容变为基本数据类型。
    int j = t.intValue(); // j = 500，intValue取出包装类中的数据

    //        包装类在实际开发中用的最多的在于字符串变为基本数据类型。
    String str1 = "30" ;
    String str2 = "30.3" ;
    int x = Integer.parseInt(str1) ; // 将字符串变为int型
    float f = Float.parseFloat(str2) ; // 将字符串变为int型


    public static void main(String[] args) {


    }








}
