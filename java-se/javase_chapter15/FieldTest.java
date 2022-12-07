package javase_chapter15;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) {
        Class clazz = Person.class;

        //获取属性结构
        //getFields()获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for(Field f:fields)
        {
            System.out.println(f);
        }
        System.out.println();

        //获取声明(不包括父类中声明的属性)
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f:declaredFields)
        {
            System.out.println(f);
        }

        for(Field f:declaredFields)
        {
            //1.权限修改符
            int modifier = f.getModifiers();
            System.out.println(modifier);
            //2.数据类型，查看Modifier.java中的内容可以看到
            /***
             * public static final int PUBLIC           = 0x00000001;
             * public static final int PRIVATE          = 0x00000002;
             * public static final int PROTECTED        = 0x00000004;
             */

            //2.数据类型
            Class type = f.getType();
            System.out.println(type.getName()+"\t");

            //3.变量名
            String name = f.getName();
            System.out.println(name);

            System.out.println();
        }

    }
}
