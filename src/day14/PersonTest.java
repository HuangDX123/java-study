package day14;
/*
    类方法(class method)

     因为不需要实例就可以访问static方法，因此static方法内部不能有this。(也 不能有super ? YES!)


    static修饰的方法不能被重写
 */


public class PersonTest {
    public static void main(String[] args) {

        System.out.println("Number of total is " + Person.getTotalPerson()); //没有创建对象也可以访问静态方法
        Person p1 = new Person();
        System.out.println( "Number of total is "+ Person.getTotalPerson());
    }

}





class Person{
    private int id;
    private static int total = 0;
    public static int getTotalPerson() {
        //id++; //非法
        return total;}
    public Person() {
        total++;
        id = total;
    }
}