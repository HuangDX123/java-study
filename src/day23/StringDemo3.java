package day23;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection 接口中声明的方法的测试
 *
 * @author shkstart
 */

public class StringDemo3 {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tome"));
        coll.add(false);
        coll.add(new Person("Jerry",20));


//        contains(Object obj):判断当前集合中是否包含obj
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tome")));
//        System.out.println(coll.containo(p)); //true
        System.out.println(coll.contains(new Person("Jerry",20)));


    }

}
