package day18;
/*
    多线程的创建，方法一：继承Thread类
    1.创建一个继承于Thread类的子类
    2.重写Thread类中的run方法 ------> 此线程执行的操作声明在run()中
    3.创建Thread子类对象，即创建了线程对象
    4.调用线程对象start方法:启动线程，调用run方法

    遍历100以内所有的偶数

 */


//    1.创建一个继承于Thread类的子类
class MyThread extends Thread {

    //        2.重写Thread类中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}

class Test extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": 第二线程" );

            }
        }

    }
}


public class ThreadTest {
    public static void main(String[] args) {
//        3.创建Thread子类对象，即创建了线程对象
        MyThread t1 = new MyThread();

//        4.调用线程对象start方法:启动线程，调用run方法
        t1.start();

        // 不能直接调用run();方法启动线程
//        t1.run();

        //如下的操作仍然在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" +i + "********************main()********************");

            }
        }

        Test test = new Test();

        test.start();

    }

}
