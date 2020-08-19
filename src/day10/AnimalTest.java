package day10;
/*
	面向对象特征之一: 封装与隐藏
	一、问题的引入：
		当我们创建一个类的对象以后，我们可以通过"对象".属性的方式：对对象的属性进行赋值。这里。赋值操作收到
		属性的数据类型和存储范围的制约。除此之外，没有其他的约束条件。但是在实际问题中，我们往往需要属性赋值
		加入额外的限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。（比如说：set）
		同时，我们需要避免用户再使用"对象．属性"的方式对属性进行赋值。则需要将属性声明为私有的（private）
	二、封装的体现：
	通过将数据声明为私有的(private)，再提供公共的(public) 方法:getXxx()和setXxx()实现对该属性的操作

	拓展：封装的体现：1 如果2不对外暴露的私有的方法3单列模式 ...

	三、封装性的体现：需要权限修饰符来配合。
	1.Java规定的4种权限（从小到大排序），private ,缺省,protected， public
	2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
	3.具体的：4种去哪想都可以用来修饰类的内部结构： 属性、方法、构造器、内部类
			修饰类的话：只能使用： 缺省、public
 */
public class AnimalTest {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.name = "大黄";
//		a.legs = 4;


		a.getAge(1);
		a.setLegs(4);
		a.show();
	}

}


class Animal{

	String name;
	private int age;
	private int legs;

	public void setLegs(int l){

		if (l >= 0 && l % 2 ==0){
			legs = l;
		}else {
			legs = 0;
			//抛出异常
		}
	}

	public void getAge(int a){
		age = a;



	}

	public int  getAge(){
		return age;


	}

	public int getLegs(){
		return legs;
	}

	public void eat(){
		System.out.println("进食");
	}

	public void show(){
		System.out.println("nanme = " + name + ", age = " + age + ", legs = " + legs);
	}
}
