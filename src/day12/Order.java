package day12;

public class Order {

    private int orderPrivate; //私有
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;


    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;

    }

    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;

    }

    protected void methodProtected() {
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;

    }

    public void methodPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;

    }


}
