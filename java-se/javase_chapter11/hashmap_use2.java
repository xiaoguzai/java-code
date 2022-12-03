package javase_chapter11;

import java.util.*;

public class hashmap_use2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

        //遍历所有的key集：keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //打印输出的结果：AA,BB,45


        System.out.println();
        Collection values = map.values();
        for(Object obj:values)
        {
            System.out.println(obj);
        }
        //打印输出的结果：123,56,123

        //遍历所有的key-value：entrySet()
        //方式一：entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext())
        {
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }

        System.out.println();

        //方式二：
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext())
        {
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "=====" + value);
        }
        /***
         * AA---->123
         * BB---->56
         * 45---->123
         */
    }
}
