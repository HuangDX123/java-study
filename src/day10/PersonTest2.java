package day10;

/*
	this关键字的使用：

	当在方法内需要用到调用该方法的对象时，就用this。

	具体使用的:我们可以用this来区分属性和局部变量。 比如:this.name = name;

	this修饰属性和方法：
	this理解为：当前对象 或 当前正在创建的对象

	在类的方法中 我们可以使用 "this.属性"或者"this.方法" 的方式，调用当前对象的属性或者方法。
	但是通常都省略掉"this." 。 在特殊情况下，如果方法的形参和类的属性重名了 我们必须显示的使用""this.变量"
	的方式 表明此变量是属性 而非形参。

	在类的构造器中 也可以调用当前或者正在创建的 this 属性


	this调用构造器
	我们在类的构造器中，可以显示的使用"this（形参列表）"方式：调用本类中指定其他构造器
	构造器中不能通过"this（形参列表）"方式调用自己
	如果一个类中声明了n个构造器，则最多有 n - 1个构造器中使用了"this(形参列表)"
	"this(形参列表)"必须声明在类的构造器的首行!
	在类的一个构造器中，最多只能声明一个"this(形参列表)"



 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();

		p1.setAge(11);
		System.out.println(p1.getAge());

		p1.eat();

		System.out.println("************************************");

		Person1 p2 = new Person1("Jerry",20);

		System.out.println(p2.getAge());

	}

}


class Person1 {
	private String name;
	private int age;

	//构造器
	public Person1(){
		this.eat();
		//Person初始化时，需要考虑1 2 3 4
		String info = "Person初始化时，需要考虑1 2 3 4";
		System.out.println(info);


	}


	public Person1(String name){
		this();
		this.name = name;

	}


	public Person1(int age){
		this();
		this.age = age;


	}
	public Person1(String name,int age){
		this(age);
		this.name = name;
//		this.age = age;
		//Person初始化时，需要考虑1 2 3 4

	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("人吃饭");
		this.study();
	}
	public void study() {
		System.out.println("人学习");
	}



}
