package com.company;

public class day6 {
	public static void main(String[] args) {
		System.out.println("-------这是第六天-循环-------");
		System.out.println("-------while循环-------");
		int x = 10;
		while (x < 20) {
			System.out.println("value of x:" + x);
			x++;
//            System.out.println("\n");
		}

		System.out.println("-------do...while循环-------");
		int c = 10;

		do {
			System.out.print("value of c : " + c);
			c++;
			System.out.print("\n" +
					"");
		} while (c < 20);

		System.out.println("-------for循环-------");
		for (int v = 10; v < 20; v = v + 1) {
			System.out.print("value of v : " + v);
			System.out.print("\n");
		}


	}


}

