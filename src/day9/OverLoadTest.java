package day9;

/*
方法的重载（overload） loading...

1.定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可


		"两同一不同":同一个类，相同方法名
					参数列表不同，参数个数不同，参数类型不同

2.举例：
	Arrays类中重载的sort（）/ binarySearch()


3.判断是否为重载：
	跟方法的权限修饰符

4.在对象调用方法时，如何确定某一个指定的方法
	方法名 ---->参数列表
 */
public class OverLoadTest {
	public static void main(String[] args) {
		OverLoadTest test = new OverLoadTest();
		test.getSun(1, 1);
	}


		//四种方法的重载
	public void getSun(int i, int j) {
		System.out.println(1);
	}

	public void getSum(double d1, double d2) {
		System.out.println(2);

	}

	public void getSum(String s, int i) {
		System.out.println(3);

	}

	public void getSum(int i, String s) {
		System.out.println(4);

	}

	//错误重载
//	public int getSum(int i,int j){
//		return 0;
//	}
//
//	public void getSum(int m,int n){
//		return 0;
//	}
//
//	private void getSum(int i,int j){
//
//	}
}
