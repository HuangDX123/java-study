package day19;

/*
    例子： 创建三个窗口卖票，总票数为100张 使用继承Thread类的方式

    使用同步继承Thread类继承类的方法


 */

class Window3 extends Thread {

    private static int ticket = 100;

     private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //正确的
            synchronized(obj){
//                错误的
//                synchronized (this)

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println(getName() + ": 卖票，票号为：" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }
        }
    }

}


public class WindowTest2 extends Thread {
    public static void main(String[] args) {
        Window3 w1 = new Window3();
        Window3 w2 = new Window3();
        Window3 w3 = new Window3();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }

}
