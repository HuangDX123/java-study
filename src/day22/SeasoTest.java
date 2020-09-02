package day22;
/**
 * 枚举类的使用
 * JDK1.5之前需要自定义枚举类
 * JDK 1.5 新增的 enum 关键字用于定义枚举类
 * 若枚举只有一个对象, 则可以作为一种单例模式的实现方式。
 * <p>
 * 枚举类的属性
 * 枚举类对象的属性不应允许被改动, 所以应该使用 private final修饰
 * 枚举类的使用 private final 修饰的属性应该在构造器中为其赋值
 * 若枚举类显式的定义了带参数的构造器, 则在列出枚举值时也必须对应的传入参数
 *
 * Enum类的主要方法:
 *  values()方法:返回枚举类型的对象数组。该方法可以很方便地遍历所有的 枚举值。
 *  valueOf(String str):可以把一个字符串转为对应的枚举类对象。要求字符 串必须是枚举类对象的“名字”。如不是，会有运行时异常: IllegalArgumentException。
 *  toString():返回当前枚举类对象常量的名称
 *
 * 实现接口的枚举类
 * 和普通 Java 类一样，枚举类可以实现一个或多个接口
 * 若每个枚举值在调用实现的接口方法呈现相同的行为方式，则只 要统一实现该方法即可。
 * 若需要每个枚举值在调用实现的接口方法呈现出不同的行为方式, 则可以让每个枚举值分别来实现该方法
 *
 *
 */

//使用enum定义枚举类
enum SeasonEnum {
    SPRING("春天", "春风又绿江南岸"),
    SUMMER("夏天", "映日荷花别样红"),
    AUTUMN("秋天", "秋水共长天一色"),
    WINTER("冬天", "窗含西岭千秋雪");


    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}

class Season {
    //1.声明Season对象的属性
    private final String SEASONNAME;//季节的名称
    private final String SEASONDESC;//季节的描述
    //2.私有化类的构造器
    private Season(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }
    //3.提供当前枚举类的多个对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");



}

public class SeasoTest {
}
