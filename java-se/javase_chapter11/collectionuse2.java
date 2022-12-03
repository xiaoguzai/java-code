package javase_chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Person1{
    String name;
    int age;
    public Person1(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class collectionuse2 {
    public static void main(String[] args) {
        //3.remove(Object obj):从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        coll.remove(1234);
        System.out.println(coll);

        coll.remove(new Person("Jerry",20));
        System.out.println(coll);

        //4.removeAll(Collection coll1):从当前集合中移除coll1中所有的元素
        Collection coll1 = Arrays.asList(123,4567);
        coll.removeAll(coll1);
        System.out.println(coll);
    }
}
