package javase_chapter12;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(65);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            int stuScore = iterator.next();
        }
    }
}
