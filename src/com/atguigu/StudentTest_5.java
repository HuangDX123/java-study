package com.atguigu;

/*
	4. 对象数组题目: 定义类Studen1，包含三个属性:学号number(int)，年级state(int)，成绩 score(int)。
	创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
	问题一:打印出3年级(state值为3)的学生信息。
	问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息


	提示:
	1) 生成随机数:Math.random()，返回值类型double;
	2) 四舍五入取整:Math.round(double d)，返回值类型long。

	  -----此代码是对StudenTest，java的改进
 */
class Studen_5Test {
	public static void main(String[] args) {

//		Studen1 s1 = new Studen1();
//		Studen1 s1 = new Studen1();
//		Studen1 s1 = new Studen1();
//		Studen1 s1 = new Studen1();
//		Studen1 s1 = new Studen1();
//		Studen1 s1 = new Studen1();

//		声明Studen1类型的数组
		Studen1[] stus = new Studen1[20]; //String[] arr = new String

		for (int i = 0; i < stus.length; i++) {
			//给数组元素赋值
			stus[i] = new Studen1();
			//给Studen1对象的属性赋值
			stus[i].number = (i + 1);
			//年纪：【1，6】
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			//成绩： 【0，100】
			stus[i].score = (int) (Math.random() * (100 - 0 + 1));
		}

		Studen_5Test test = new Studen_5Test();
		//遍历学生数组
		System.out.println("**********************遍历学生数组**********************");
		test.print(stus);


//		问题一:打印出3年级(state值为3)的学生信息。
		System.out.println("*************打印出3年级(state值为3)的学生信息*************");
		test.searchState(stus, 3);

//		问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
		System.out.println("*********************冒泡排序法***********************");
		test.sort(stus);

//		遍历学生数组
		test.print(stus);


//		for (int i = 0; i < stus.length; i++) {
//			System.out.println(stus[i].info());
//
//		}

	}
	//创造方法
	//遍历Student1[]数组操作

	/**
	 * @param stus
	 * @Description 遍历Student1[]数组操作
	 * @author shkstart
	 * @date 2020.8.16.06.26
	 */
	public void print(Studen1[] stus) {
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}

	/**
	 * @param stus  要找的数组
	 * @param state 要找的年级
	 * @Description 查找Stduent数组中指定年纪的学生信息
	 * @author shkstart
	 * @date 2020.8.16.06.26
	 */
	//查找三年的学生信息
	public void searchState(Studen1[] stus, int state) {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == 3) {
				System.out.println(stus[i].info());
			}
		}
	}

	/**
	 * 给Studen1数组使用冒泡排序
	 *
	 * @param stus
	 * @author shkstart
	 * @date 2020.8.16.06.26
	 */
	//给Studen1数组使用冒泡排序
	public void sort(Studen1[] stus) {
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].score > stus[j + 1].score) {
					//如果需要换序，交换的是数组的元素，Studen1对象！
					Studen1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;



				}

			}

		}

	}

}

class Studen1 {
	int number;//学号
	int state;//年纪
	int score;//成绩


	//显示学生信息的方法
	public String info() {
		return "学号：" + number + ",年级：" + state + ",成绩：" + score;
	}

}