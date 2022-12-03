package javase_chapter4;
class Person{
    int age;
}

public class chapter_4_parameter2 {
    public static void change(Person obj)
    {
        System.out.println("change:修改之前age = "+obj.age);
        obj.age = 3;
        System.out.println("change:修改之后age = "+obj.age);
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.age = 5;
        System.out.println("修改之前age = "+obj.age);//5
        change(obj);//修改之前age=5,修改之后age=3
        System.out.println("修改之后age = "+obj.age);//3
        //原因：无论是在函数内还是在函数外，类中变量在同一个堆中运行
    }
}
