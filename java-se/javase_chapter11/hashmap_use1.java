package javase_chapter11;

import java.util.HashMap;
import java.util.Map;

public class hashmap_use1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.添加
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //{AA=87,BB=56,45=123}

        //2.修改
        map.put("AA",87);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);
        map.putAll(map1);
        System.out.println(map);
        //{AA=87,BB=56,CC=123,DD=123,45=123}

        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);

        Map map2 = new HashMap();
        map2.put("AA",123);
        map2.put(45,123);
        map2.put("BB",56);
        System.out.println(map2.get(45));
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);
        map2.clear();
        System.out.println(map2.isEmpty());
    }
}
