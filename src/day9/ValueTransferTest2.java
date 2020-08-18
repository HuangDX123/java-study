package day9;

public class ValueTransferTest2 {
	public static void main(String[] args) {

		Data data = new Data();
		data.m = 10;
		data.n = 20;

		System.out.println("m = " + data.m + ", n = " + data.n);

		//交换俩个变量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;

		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);


		System.out.println("m = " + data.m + ", n = " + data.n);


	}
	public void swap(Data data){
//		交换俩个变量的值的操作
		int temp = data.m;
		data.m = data.n;
		data.n = temp;

	}

}


class Data{

	int m;
	int n;
}