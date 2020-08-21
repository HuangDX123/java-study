package day12;

public class Student extends Person {

    String major;


    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习。专业是：" + major);
    }


    //对父类的 eat 方法 进行重写
    public void eat(){
        System.out.println("学生吃有营养的");
        System.out.println("学生吃有营养的");

    }
}
