package javase_chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class properties {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        /***
         * Collections类中提供了多个synchronizedXxx()方法，
         * 该方法可以使指定集合包装成线程同步的集合，从而可以解决
         * 多线程并发访问集合时的安全问题
         */

        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);
        System.out.println(dest);

        //返回的list1即为线程安全的list1
        List list1 = Collections.synchronizedList(list);
    }
}
