package company;

public class Person implements PersonInterface {
	public int abcd;
    public String name;
    protected int abc;
	private int age;
	private String nickname;
	private int cdb;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String nickname) {
		this.name = name;
		this.age = age;
		this.nickname = nickname;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public void eat(String what) {

	}

	@Override
	public void drink() {

	}
}
