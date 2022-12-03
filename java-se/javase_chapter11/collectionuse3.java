package javase_chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Person2
{
    String name;
    int age;
    public Person2(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class collectionuse3 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",18));
        coll.add(new String("Tom"));
        coll.add(false);

        System.out.println(coll.hashCode());

        //集合-->数组：toArray()
        Object[] arr = coll.toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        //拓展：数组--->集合:调用Arrays的静态方法aslist()
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);

        List<int[]> arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1);
        //这里写的是将整体的结构当成了一个元素

        List arr2 = Arrays.asList(new int[]{123,456});
        System.out.println(arr2.size());//1

        List arr3 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr3.size());//2
        //写的是包装类的对象，它就认为是两个，如果写的是new int[]对象就认为是一个
        //iterator()返回Iterator接口的实例，用于遍历集合元素，放在IteratorTest.java中测试
    }
}
