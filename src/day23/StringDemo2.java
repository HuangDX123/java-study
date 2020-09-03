package day23;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 一、集合框架的概述
 * <p>
 * 1.集合、数组都是对多个数组进行存储操作的结构，简称与JAva容器
 * 说明：此时的存储，主要指的是内存层面的储存，不设计及到持久化的存储（.txt .jpg .avi 数据库中
 * <p>
 * <p>
 * 集合框架
 * Collection接口：单列集合，用来存储一个一个的对象
 * List接口：存储有序的、可重复的数据。-->动态数组
 * ArrayList、LinkedList、Vector
 * <p>
 * Set接口：存储无序的、不可重复的数据       高中讲的集合
 * HashSet、LinkedList、Vector
 * <p>
 * Map接口：双列集合，用来存储一对(key - value) 一对的数据      高中函数 y = f(x)
 * HashMap LinkedHashMap TreeMap Hashtable Properties
 * <p>
 * <p>
 * Collection 接口方法
 * <p>
 * 1、添加
 *  add(Object obj)
 *  addAll(Collection coll)
 * 2、获取有效元素的个数  int size()
 * 3、清空集合
 *  void clear()
 * 4、是否是空集合
 *  boolean isEmpty()
 * 5、是否包含某个元素
 *  boolean contains(Object obj):是通过元素的equals方法来判断是否
 * 是同一个对象
 * boolean containsAll(Collection c):也是调用元素的equals方法来比
 * 较的。拿两个集合的元素挨个比较。
 * 6、删除
 *  boolean remove(Object obj) :通过元素的equals方法判断是否是
 * 要删除的那个元素。只会删除找到的第一个元素
 *  boolean removeAll(Collection coll):取当前集合的差集
 * 7、取两个集合的交集
 *  boolean retainAll(Collection c):把交集的结果存在当前集合中，不
 * 影响c 8、集合是否相等
 *  boolean equals(Object obj) 9、转成对象数组
 *  Object[] toArray() 10、获取集合对象的哈希值
 *  hashCode() 11、遍历
 *  iterator():返回迭代器对象，用于集合遍历
 */

public class StringDemo2 {

    @Test
    public void test1() {

        Collection coll = new ArrayList();

        //add(Object e): 将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());

        //sizi():获取添加的元素个数
        System.out.println(coll.size());//4

        //addAll():
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll1.addAll(coll1);

        System.out.println(coll.size());//6
        System.out.println(coll);


        //clear():清空集合元素
        coll.clear();

        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());

    }


}
