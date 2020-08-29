package day14;


/*
            代码块
    类的成员之4  代码块（初始化）

    1.作用 用来初始化类、对象
    2.代码块如果有修饰的话 只能用static
    3.分类 静态 非静态

    4 静态代码块
        内部可以有输出语句
        随着类的加载而执行，而且只执行一次
        作用：初始化类的信息
        如果一个类中定义了多个静态代码块 则按照声明的先后顺序实行
        静态代码块 的实行要优先于非静态代码块的执行

    5 非静态代码块
        内部可以有输出语句
        随着对象的创建而执行
        而且是每创建一次对象，就执行一次非静态
        作用：可以在创建对象的时候 对对象的属性等进行初始化



    对属性的可以赋值的位置
    默认初始化
    显示初始化
    构造器初始化
    有了对象以后 可以通过 对象.属性 或者 对象.方法对的方式进行赋值
    在代码块进行赋值


 */
public class BlockTest {
    public static void main(String[] args) {

        String desc = Person1.desc;
        System.out.println(desc);


        Person1 p1 = new Person1();
        Person1 p2 = new Person1();
        System.out.println(p1.age);

        Person1.info();


    }
}


class Person1 {
    //属性
    String name;
    int age;
    static String desc = "我是一个中国人";


    //构造器
    public Person1() {

    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //static 代码块 （静态代码块）
    static {
        System.out.println("你好 静态的 static 1");
        desc = "我是一个爱学习的人";

    }

    static {
        System.out.println("你好 静态的 static 2");


    }

    //非static 代码块
    {
        System.out.println("你好  非静态的 static");
        age = 1;
    }


    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info() {
        System.out.println("我是一个快乐的人");
    }
}