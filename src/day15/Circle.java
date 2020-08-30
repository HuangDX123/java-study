package day15;

/*
    定义一个Circle 类，声明radius属性， 提供getter和setter方法

 */
public class Circle {

    private  double radius;

    public  double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Circle(){
        super();
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

}
