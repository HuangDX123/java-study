package day13_2;

/*
    利用Vector代替数组处理:从键盘读入学生成绩(以负数代表输入结束)，找出 最高分，并输出学生成绩等级。
    提示:数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的 长度。而向量类java.util.Vector可以根据需要动态伸缩。

    创建Vector对象: Vector v=new Vector();
    给向量添加元素:v.addElement(Object obj);   //obj必须是对象
    取出向量中的元素:Object obj=v.elementAt(0);
    注意第一个元素的下标是0，返回值是Object类型的。
    计算向量的长度:v.size();
    若与最高分相差10分内:A等;20分内:B等;
    30分内:C等;其它:D等
 */

import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        //1.实例化Scanner ,用于从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);



        //2.创建Vector对象： Vector v = new Vector();相当于原来的数组
//        Vector v = new Vector();



        //3.通过for(;;)或while(true)方式， 给Vector中添加数组
        int maxScore = 0;

        for(;;){
            System.out.println("请输入学生成绩（负数代表输入结束）");
            int score = scan.nextInt();
            //3.2当输入是负数的时候，就跳出循环

            if (score < 0 ) {
                break;
            }
            if (score > 100){
                System.out.println("您输入的数字非法请重新输入");
                continue;
            }



            //3.1添加操作；； V.addElement(Object obj)
//            Integer integer = new Integer(score);
//            v.addElement(score); //自动装箱

            //4.获取学生成绩最大值
            if (maxScore < score){
                maxScore = score;

            }


        }

        //5.遍历Vector.得到每个学生的成绩，并与最大成绩比较 得到每个学生成绩

//    char level;
//    for (int i = 0 ; i< v.size();i++){
//        Object obj = v.elementAt(i);

//        if (maxScore - score <= 10){
//            level = 'A';
//        }else if (maxScore - score <= 20){
//            level = 'B';
//        }else if (maxScore -score <= 30){
//
//        }



    }




    }

