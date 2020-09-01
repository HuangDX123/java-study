package day18;
/*
    测试Thread中的常用方法：      线程优先级

    1-start(): 启动线程，并执行对象的run()方法
    2-run(): 线程在被调度时执行的操作
    3-currentThread():静态方法，返回执行当前代码过程
    4-getName():获取当前线程的名字
    5-setName():设置当前线程的名字
    6-yield():线程让步 暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程 若队列中没有同优先级的线程，忽略此方法
    7-join():当某个程序执行流中调用其他线程的 join() 方法时，调用线程将 被阻塞，直到 join() 方法加入的 join 线程执行完为止
    8-stop():已过时 强制线程生命期结束，不推荐使用
    9-sleep(long millis):(指定时间:毫秒)
    10-isAlive():返回boolean，判断线程是否还活着


    线程优先级：
    1.MAX_PRIORITY:10 最大
    2.MIN _PRIORITY:1 最小
    3.NORM_PRIORITY:5 默认


    涉及的方法
        getPriority() :返回线程优先值
        setPriority(int newPriority) :改变线程的优先级

        说明：高优先级的线程要抢占低优先级的CPU执行权。但是只是从概率上来讲 高优先级的线程高概率的优先










    -String getName(): 返回线程的名称
    -void setName(String name):设置该线程名称
    -static Thread currentThread(): 返回当前线程。在Thread子类中就 是this，通常用于主线程和Runnable实现类
        低优先级的线程也可以获得执行
        令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后 重排队。
        抛出InterruptedException异常
    -boolean isAlive():返回boolean，判断线程是否还活着
 */

//分线程
class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 || i == 1) {

//                sleep(long millis):(指定时间:毫秒)
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                System.out.println(Thread.currentThread().getName() + "：" + Thread.currentThread().getPriority() + ":" + i);
            }
//            if (i % 20 == 0) {
//                this.yield();
//            }

        }
    }

    public HelloThread(String name) {
        super(name);
    }
}


public class ThreadMethodTest {
    //主线程
    public static void main(String[] args) {

        HelloThread h1 = new HelloThread("Thread:1");


//        h1.setName("线程一");

        //设置分线程优先级
        h1.setPriority(Thread.MAX_PRIORITY);

        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);


        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 || i == 1) {
//                try {
//                    sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                System.out.println(Thread.currentThread().getName() + "：" + Thread.currentThread().getPriority() + ":" + i);
            }
//            if (i == 20) {
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }
        System.out.println(h1.isAlive());

    }
}
