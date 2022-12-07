package javase_chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    private String name;
    public int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    private Person(String name)
    {
        this.name = name;
    }

    public Person(){}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name = "+this.name+" age = "+this.age;
    }

    public void show()
    {
        System.out.println("你好，我是一个人");
    }

    private String showNation(String name)
    {
        System.out.println("名字为 = "+name);
        return name;
    }
}

public class reflect1 {
    public static void main(String[] args) throws Exception{
        Class clazz = Person.class;
        //1.通过反射创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        //第一个参数为String，第二个参数为int
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person)obj;
        System.out.println(p.toString());
        //2.通过反射调用对象指定的属性、方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法,空参方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("*****************************");

        //通过反射，可以调用Person类的私有结构，
        //比如私有的构造器、方法、属性等
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        //注意这里必须要有private void Person(String name)这个构造方法
        //否则会报错，此时这里正好能够调用私有的构造器
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeimei");
        System.out.println(p1.toString());

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String)showNation.invoke(p1,"中国");//相当于String nation = p1.showNation("中国");
        //这里仍然是对象调用，只不过这里的对象是原来的方法
        System.out.println(nation);
    }
}
