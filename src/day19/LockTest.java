package day19;
/*
    Lock(锁)
    解决线程安全问题的方式三：Lock锁   ----JDK5.0新增

 */

import java.util.concurrent.locks.ReentrantLock;

class Window implements  Runnable{
    private int ticket = 100000;

    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try{

                //调用lock方法
                lock.lock();



                if (ticket > 0) {

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                ticket--;

            } else {
                break;
            }
            }finally {
                //调用解锁的方法
                lock.unlock();

            }


            }
        }

    }






public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();

        Thread t1 =new Thread(window);
        Thread t2 =new Thread(window);
        Thread t3 =new Thread(window);
        Thread t4 =new Thread(window);
        Thread t5 =new Thread(window);
        Thread t6 =new Thread(window);
        Thread t7 =new Thread(window);
        Thread t8 =new Thread(window);
        Thread t9 =new Thread(window);
        Thread t10 =new Thread(window);



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
        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();




    }
}
