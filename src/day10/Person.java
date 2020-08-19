package day10;
/*
	1.创建程序,在其中定义两个类:Person和PersonTest类。定义如下:
	用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。

	在PersonTest类中实例化Person类的对象b，调用setAge()和 getAge()方法，
	体会Java的封装性。

	练习二、
	1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属 性初始值都为18。
	2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同 时初始化对象的age属性值和name属性值。


 */
public class Person {

	private  int age;
	private String name;

	public Person(){
		age = 18;
		name = "Tom1";
	}

//	public Person(String n, int a);{
//		name = n;
//		age = a;
//	}



	public Person(String n,int a){
		name = n;
		age = a;
	}





	//设置
	public void setAge(int a){
		if (a < 0 || a > 130){
			//抛出异常
			throw new RuntimeException("传入的数据非法");
//			System.out.println("传入的数据非法");
		}

		age = a;
	}


	//获取
	public int getAge(){
		return age;
	}


	public void setName(String n){
		name = n;

	}

	public String getName(){
//		name = "Tom";
		return name;
	}



//	绝对不要这样子写
//	public int doAge(int a){
//		age = o;
//		return age;
//	}

}
