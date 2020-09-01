package day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    创建线的方式四：使用线程池
 */

class NumberThread implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sum += i;
            }
        }
    }
}

class anOddNumber implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sum += i;
            }
        }

    }
}


public class ThreadPool {

    public static void main(String[] args) {

            //1 提供指定数量线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //2 执行指定的线程的操作 需要提供Runnable接口 或者Callable接口实现类的对象
        service.execute(new NumberThread());//适合适用于Runnable
        service.execute(new anOddNumber());//适合适用于Runnable
//        service.submit(new NumberThread());//适合适用于Callable


        //3 关闭连接池
        service.shutdown();

    }
}
