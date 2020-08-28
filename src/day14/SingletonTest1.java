package day14;

/*
    单例 (Singleton)设计模式

    1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对 某个类只能存在一个对象实例

    2.如何实现？
    饿汉式 懒汉式

 */

public class SingletonTest1 {
    public static void main(String[] args) {

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();


        System.out.println(bank1 == bank2);
    }

}


//饿汉式
class Bank {

    //2.内部创建类的对象
    //要求此对象也必须声明为静态对象
    private static Bank instance = new Bank();

    //1.私有化类的构造器
    private Bank() {

    }

    //3.提供公共静态的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }

    public void setInstance(Bank instance) {
        this.instance = instance;
    }
}