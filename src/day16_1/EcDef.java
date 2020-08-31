package day16_1;
//自定义异常类
public class EcDef extends Exception {

    static final long serialVersionUID = -13885653435L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }

}
