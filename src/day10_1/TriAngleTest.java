package day10_1;

public class TriAngleTest {
	public static void main(String[] args) {

		TriAngle t1 = new TriAngle();
		t1.setBase(2.0);
		t1.setHeight(2.4);


		System.out.println("base :" + t1.getBase() + "\t\t" +"height :" + t1.getHeight());

		TriAngle t2 = new TriAngle(5.1,5.6);
		System.out.println("base :" + t2.getBase() + "\t\t" +"height :" + t2.getHeight());



	}
}
