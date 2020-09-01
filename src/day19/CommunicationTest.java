package day19;
/*
    使用两个线程打印 1-100。线程1, 线程2 交替打印


    使得调用如下wait()方法的线程进入堵塞状态

    notify();唤醒

 */

class Number implements Runnable{
    private int number = 1;

    @Override
    public void run() {

        while (true){

            synchronized (this){

                notify();

             if (number <= 100){

                try {
                    Thread.sleep(1);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+":"+number);
                number++;

                 try {
                     //使得调用如下wait()方法的线程进入堵塞状态
                     wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }


             }else {
                break;
                 }
            }
        }
    }
}

public class CommunicationTest {

    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);


        t1.setName("程序1");
        t2.setName("程序2");

        t1.start();
        t2.start();
    }
}
