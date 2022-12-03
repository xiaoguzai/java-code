package javase_chapter11;

import java.util.ArrayList;
import java.util.Collection;

class Person{
    String name;
    int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class collectionuse1 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Person("Jerry",20));

        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll1.contains(new Person("Jerry",20)));

        System.out.println(coll.size());

    }
}
