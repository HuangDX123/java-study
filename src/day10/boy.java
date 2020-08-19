package day10;



public class boy {


	private String name;
	private int age;

	public boy() {

	}

	public boy(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void marry(Girl girl){
		System.out.println("我想取：" + girl.getName());
	}

	public void shout(){
		if (this.age >= 22) {
			System.out.println("你可以去合法登记结婚啦！");

		}else {
			System.out.println("先多谈恋爱！");

		}
		}
	}

