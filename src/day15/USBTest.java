package day15;

/*
    接口的使用
    接口使用的多态性
    接口实际上定义了接口的规范
    开发中，体会面向接口编程'

 */
public class USBTest {
    public static void main(String[] args) {

        Computer com = new Computer();
        //1 创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);


        //2 创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3 创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");

            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");


            }
        };
        com.transferData(phone);

        //4. 创建了接口的匿名实现类的匿名对象

        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3结束工作");


            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");

            }
        });
    }

}





interface USB {
    //常量：定义长宽最大最小的传输速度等

    void start();

    void stop();

}

class Computer {

    public void transferData(USB usb) {
        usb.start();

        System.out.println("具体传输数据的希捷");

        usb.stop();
    }
}


class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");

    }

}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");

    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");

    }
}