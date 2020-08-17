package company;

public class Main {

	public static void main(String[] args) {
		// write your code here
		label:
		for (int j = 1; j <= 100; j++) {
			for (int i = 1; i <= 10; i++) {

				if (i % 5 == 0) {
					System.out.println("这是第" + j + "轮," + i + "次输出");
                    continue label;
				}
				//System.out.println(j);
			}
			System.out.println();

		}


	}
}
