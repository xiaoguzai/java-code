package javase_chapter11;

import java.util.*;

class User implements Comparable
{
    String name;
    int age;
    public User(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean equals(Object c){
        if(this == c) return true;
        if(c == null||getClass() != c.getClass())
        {
            return false;
        }

        User user = (User) c;
        if(age != user.age) return false;
        return name != null ? name.equals(user.name):user.name == null;
    }


    @Override
    public int hashCode() {
        //没有重写hashCode的时候，调用的是object方法之中的
        //native方法，可以理解为随机计算的
        //只有两者的hash值相同的时候，才可以进行覆盖
        int result = name != null?name.hashCode():0;
        result = 31*result+age;
        return result;
    }


    @Override
    public String toString() {
        return "姓名为"+this.name+" 年龄为"+this.age;
    }

    //按照姓名从小到大的顺序排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof User)
        {
            User user = (User) o;
            int compare = -this.name.compareTo(user.name);
            if(compare != 0)
            {
                return compare;
            }
            else
            {
                return Integer.compare(this.age,user.age);
            }
        }
        else
        {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}

public class collectiontry {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(456);
        set.add(new User("name",12));
        set.add(new User("name",12));
        set.add(123);

        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //LinkedHashSet的使用
        Set set1 = new LinkedHashSet();
        set1.add(456);
        set1.add(123);
        set1.add(123);
        set1.add("AA");
        set1.add("CC");
        set1.add(new User("Tom",12));
        set1.add(new User("Tom",12));
        set1.add(129);
        Iterator iterator1 = set1.iterator();
        System.out.println();
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
    }
}
