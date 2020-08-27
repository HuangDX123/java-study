package day13_1;

public class Customer {

    private String name;
    private int age;

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

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写的原则：比较两个对象的实体内容（即：name和age）是否相等


    @Override
    public boolean equals(Object obj) {

        System.out.println("Customer equals()....");
        if (this == obj){
            return true;
        }
        if (obj instanceof Customer){
            Customer cust = (Customer)obj;

            return this.age == cust.age && this.name.equals(cust.name);

        }else {
            return false;
        }


//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Customer customer = (Customer) o;
//        return age == customer.age &&
//                Objects.equals(name, customer.name);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
