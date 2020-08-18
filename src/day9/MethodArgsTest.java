package day9;
/*
	可变个数的形参方法

	1.jdk 5.0新增的内容
	2.具体使用:
		2.1 可变个数形参的格式：数据类型 ... 变量名
		2.2 调用可变个数形参的方法时，传入的参数个数可以是 0、1、2、个....
		2.3. 可变个数形参的方法与同名的方法之间，彼此构成重载
		2.4. 可变参数方法的使用与方法参数部分使用数组是一致的
		2.5. 方法的参数部分有可变形参，需要放在形参声明的最后
		2.6. 在一个方法的形参位置，最多只能声明一个可变个数形参

	允许直接定 义能和多个实参相匹配的形参。从而，可以用一种更简单的方式，
	来传递个数可 变的实参。


 */
public class MethodArgsTest {

	public static void main(String[] args) {

		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello", "world");
		test.show();

	}


	public void show(int i){
		System.out.println("1");
	}

	public void show(String  s){
		System.out.println("2");
	}

	public void show(String ... strs){
		System.out.println("show(String ... strs)");

		for (int i = 0;i < strs.length;i++){
			System.out.println(strs[i]);
		}
	}

	//与上相同
//	public void show(String[] strs){
//
//	}



}
