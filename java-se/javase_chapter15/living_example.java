package javase_chapter15;

import sun.reflect.Reflection;

public class living_example {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一：调用运行时类的属性：.class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二；通过运行时类的对象
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        //方式三：调用class的静态方法：forName(String classPath)，使用频率较高
        Class clazz3 = Class.forName("javase_chapter15.Person");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);//true
        System.out.println(clazz1 == clazz3);//true
        //言外之意：获取到的为同一个类，只不过获取的方式有所不同
        //运行时的类一旦加载到内存中之后，会缓存一段时间，在此
        //时间之内，我们可以通过不同的方式来获取此运行时类

        //说白了，这三种实例化指的是一个内存空间对象

        //方式四：采用类的加载器:ClassLoader
        /***
        ClassLoader classLoader = Reflection.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("javase_chapter15.Person");
        System.out.println(clazz4);
         ***/
    }
}
