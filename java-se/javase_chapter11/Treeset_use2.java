package javase_chapter11;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_use2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));

        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
