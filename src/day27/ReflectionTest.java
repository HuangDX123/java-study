package day27;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    //反射之前，对于Person的操作
    @Test
    public void test1(){

        //1.创建Person类的对象
        Person p1 = new Person("Tom",13);

        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person 类外部  不可以通过Person类的对象调用其私有的构造器
        //比如 name shNation（）以私有的构造器
    }


    //反射之后，对于Person的操作
    @Test
    public void test2() throws Exception{
        Class clazz = Person.class;
        //1.通过反射 创建Person类的对象

        Constructor cons =  clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom",12);
        Person p = (Person) obj;
        System.out.println(p.toString());
//        2.通过反射 调用对象指定的属性、方法
        Field age =clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

//        调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        System.out.println("************************************");

        //通过反射 可以调用Person类的私有结构 比如 私有的构造器 、方法、属性
//        调用私有的构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);


        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeimei");
        System.out.println(p1);

//        //调用私有的方法
//        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
//        showNation.setAccessible(true);
//        String nation = (String) showNation.invoke(p1,"中国");//相当于p1.showNation
//        System.out.println(nation);
    }


    /**
     * 加载到内存中的运行时类 会缓存一定的时间 在此时间内 我们可以通过不同的方式来获取此运行时的方式
     * @throws ClassNotFoundException
     */

    //获取Class的实例的方法
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一 调用运行时类的属性 .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二 通过运行时类的对象 调用getClass()
        Person p1 = new Person();
        p1.getClass();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        //方式二 调用Class的静态方法 forName(String classPath)
        Class clazz3 = Class.forName("day27.Person");
//        clazz3 = Class.forName("java.lang.String");

        System.out.println(clazz3);


        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);


        //方式四 使用类的加载器 ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class class4 = classLoader.loadClass("day27.Person");
        System.out.println(class4);
    }



}
