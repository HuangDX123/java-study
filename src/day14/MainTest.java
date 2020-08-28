package day14;
/*
    理解main方法的语法
    1.main()方法作为程序入口
    2.main()方法也是一个普通的静态方法

 */
public class MainTest {
    public static void main(String[] args) { //入口

        Main.main(new String[100]);

    }
}


class Main{
    public static void main(String[] args) {

        for(int i = 0;i< args.length;i++){
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}