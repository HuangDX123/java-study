package day19;

/*
    使用同步方法解决实现Runnable接口的线程安全问题
 */
class Window4 implements Runnable{

    private  int ticket = 100;
    //    Object obj = new Object();
    //    Dog dog = new day18.Dog();





    @Override
    public  void run() {
            while (true) {
                show();
                break;




        }


    }


    private synchronized void show(){    //同时监控
//        synchronized (this){
            if (ticket > 0) {

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                ticket--;

            }

//        }



    }

}




public class WindowTest3 {
    public static void main(String[] args) {
//        Window3 W = new Window3();
        Window4 W = new Window4();

        Thread t1 = new Thread(W);
        Thread t2 = new Thread(W);
        Thread t3 = new Thread(W);



        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");


        t1.start();
        t2.start();
//        t3.start();


    }
}