package day22;
/**
 * @author shkstart
 * @version 1.0
 * @see Math.java
 *
 */

/*
 * 注解(Annotation)
 *
 * @author 标明开发该类模块的作者，多个作者之间使用,分割 @version 标明该类模块的版本
 * @see 参考转向，也就是相关主题
 * @since 从哪个版本开始增加的
 * @param 对方法中某参数的说明，如果没有参数就不能写
 * @return 对方法返回值的说明，如果方法的返回值类型是void就不能写
 * @exception 对方法可能抛出的异常进行说明 ，如果方法没有用throws显式抛出的异常就不能写 其中
 *
 *  @param @return 和 @exception 这三个标记都是只用于方法的。
 *  @param的格式要求:@param 形参名 形参类型 形参说明
 *  @return 的格式要求:@return 返回值类型 返回值说明
 *  @exception的格式要求:@exception 异常类型 异常说明
 *  @param和@exception可以并列多个
 *
 */


public class AnnotationTest {

    /**
     * 程序的主方法，程序的入口
     * @param args String[] 命令行参数
     */
    public static void main(String[] args) {
        System.out.println(getArea(1));

    }

    /**
     * 求园面积的方法
     * @param radius double 半径值
     * @return double 园的面积
     */
    public static double getArea(double radius){
        return Math.PI * radius * radius;
    }




}
