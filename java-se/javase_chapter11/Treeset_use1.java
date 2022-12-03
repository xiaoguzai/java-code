package javase_chapter11;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_use1 {
    //TreeSet:可以按照添加对象的指定属性进行排序
    //不能够添加不同类的对象
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(34);
        set.add(-34);
        set.add(43);
        set.add(11);
        set.add(8);

        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
