package day10;

public class Order {

	private int orderPrivate;
	int orderDefault;
	public int orderPulic;

	private void methodPrivate(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPulic = 3;

	}

	void methodDefault(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPulic = 3;

	}

	public void methodPublic(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPulic = 3;

	}

}
