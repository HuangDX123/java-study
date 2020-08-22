package day12_1;

public class Student extends Person {

    String major;
    int id = 1002;//学号

    public Student() {

    }

    public Student(String major) {
        this.major = major;

    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的");
    }

    public void study() {
        System.out.println("学生学习知识");

    }

    public void show() {

        System.out.println("name=" + this.name + ", + age =" + super.age);
        System.out.println("id = " + id);

        System.out.println("id = " + super.id);
    }
}
