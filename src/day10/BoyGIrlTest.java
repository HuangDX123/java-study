package day10;

public class BoyGIrlTest {
	public static void main(String[] args) {

		boy boy = new boy("罗密欧",21);
		boy.shout();

		Girl girl = new Girl("朱丽叶",18);
		girl.marry(boy);

		Girl girl1 = new Girl("祝英台",29);
		int compare = girl.compare(girl1);
		if (compare > 0){
			System.out.println(girl.getName() + "大");
		}else if (compare < 0){
			System.out.println(girl1.getName() + "大");

		}else {
			System.out.println("一样大");

		}

	}
}
