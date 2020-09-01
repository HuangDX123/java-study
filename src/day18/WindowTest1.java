package day18;
/*

            Synchronized的使用方法
    例子： 创建三个窗口卖票，总票数为100张  使用Thread 接口的方式
    存在线程安全问题  已经解决 ，使用Synchronized的方法

    说明 操作共享数据的代码即为需要被同步的代码
        共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
        同步监视器 俗称：锁 任何一个类的对象 都可以充当


        方式二：同步方法

        同步的方法、解决了线程的安全问题
        操作同步代码时 只能有一个线程参与 其他线程等待

 */




class Window1 implements Runnable{

    private  int ticket = 100;
//    Object obj = new Object();
    Dog dog = new Dog();

    @Override
    public  void run() {

        synchronized (dog) {
            while (true) {
                if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                    System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }
        }
    }
}


class Dog{

}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 W = new Window1();

        Thread t1 = new Thread(W);
        Thread t2 = new Thread(W);
        Thread t3 = new Thread(W);
        Thread t4 = new Thread(W);
        Thread t5 = new Thread(W);
        Thread t6 = new Thread(W);
        Thread t7 = new Thread(W);
        Thread t8 = new Thread(W);
        Thread t9 = new Thread(W);
        Thread t10 = new Thread(W);


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t4.setName("窗口4");
        t5.setName("窗口5");
        t6.setName("窗口6");
        t7.setName("窗口7");
        t8.setName("窗口8");
        t9.setName("窗口9");
        t10.setName("窗口10");

        t1.start();
        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();

    }
}
