package javase_chapter15;

import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) {
        Class clazz = Person.class;

        //getMethods();获取当前运行时类及其所有父类中
        //声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for(Method m : methods)
        {
            System.out.println(m);
        }

        //getDeclaredMethods()：获取当前运行类(不包含父类)中所有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m:declaredMethods)
        {
            System.out.println(m);
        }
    }
}
