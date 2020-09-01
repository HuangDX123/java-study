package day19;


/*
    使用同步方法 来继承Thread类


    关于同步方法的总结
    同步方法仍然涉及到同步监视器 只是不需要我们显示的声明
    非静态的同步方法 同步监视器是 this
    静态的同步方法 同步监视器是 当前类本身

 */



class Window5 extends Thread {

    private static int ticket = 100;

//    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {

            show();

      }
    }

    private static synchronized void show(){
            if (ticket > 0) {

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(Thread.currentThread().getName()+ ": 卖票，票号为：" + ticket);
                ticket--;

            }
        }

        }








public class WindowTest5 extends Thread{
    public static void main(String[] args) {
        Window5 w1 = new Window5();
        Window5 w2 = new Window5();
        Window5 w3 = new Window5();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}
