package day10_1;
/*
	总结： 属性赋值的先后顺序


	1.默认值初始化
	2.显式初始化
	3.构造器中赋值
	4.通过"对象.方法" 或 "对象.属性" 的方式：赋值

	以上的操作先后顺序为 1234     1324

 */
public class UserTest {
	public static void main(String[] args) {
		User u = new User();

		System.out.println(u.age);

		User u1 =new User(2);
		System.out.println(u1.age);
	}
}


class User{
	String name;
	int age = 1;

	public User(){

	}
	public User(int a){
		age = 2;

	}


}