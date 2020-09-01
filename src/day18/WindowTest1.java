package day18;
/*
    例子： 创建三个窗口卖票，总票数为100张  使用Thread 接口的方式
    存在线程安全问题 待解决

 */
class Window1 implements Runnable{
    private  int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                ticket--;

            } else {
                break;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 W = new Window1();

        Thread t1 = new Thread(W);
        Thread t2 = new Thread(W);
        Thread t3 = new Thread(W);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
