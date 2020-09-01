package day18;
/*
    创建两个分线程，让其中一个线程输出1-100之间的偶数，另一 个线程输出1-100之间的奇数。
 */


class anEvenNumber extends Thread {

    @Override
    public void run() {
        int n = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                n++;
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
        System.out.println("线程Thread-0运行了：" + n + "次");
    }
}

class anOddNumber extends Thread {

    @Override
    public void run() {
        int n = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0 || i == 1) {
                n++;

                System.out.println(Thread.currentThread().getName() + "：" + i);
            }

        }
        System.out.println("线程Thread-1运行了："  + n + "次");

    }

}


public class ThreadDemo {
    public static void main(String[] args) {
//        anEvenNumber m1 = new anEvenNumber();
//        anOddNumber m2 = new anOddNumber();
//
//        m1.start();
//        m2.start();

        //创建Thread类的匿名子类的方式

        new Thread(){
            @Override
            public void run() {
                int n = 0;

                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        n ++;
                        System.out.println(Thread.currentThread().getName() + "：" + i);
                    }
                }
                System.out.println("线程Thread-0运行了：" + n + "次");
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                int n = 0;

                for (int i = 0; i < 100; i++) {

                    if (i % 2 != 0) {
                        n ++;

                        System.out.println(Thread.currentThread().getName() + "：" + i);
                    }

                }
                System.out.println("线程Thread-1运行了："  + n + "次");

            }
        }.start();



    }
}
