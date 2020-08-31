package day16;

/*
        手动抛出异常
 */
public class StudentTest {

    public static void main(String[] args) {
        try{
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}







class Student{

    private int id;

    public void regist(int id) throws Exception{
        if (id > 0){
            this.id = id;

        }else {
//            System.out.println("您的输入的数据非法！！");
            //手动抛出异常
//            throw new RuntimeException("您的输入的数据非法！！");
//            throw new Exception("您的输入的数据非法！！");
             //异常类的对象
            throw new MyException("不能输入负数");
        }

    }

    public String toString(){
        return "Student [id=" + id + "]";
    }
}