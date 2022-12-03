package javase_chapter4;

public class chapter_4_parameter3 {
    public static void change(Person obj)
    {
        obj = new Person();
        System.out.println("change:修改之前age = "+obj.age);
        obj.age = 3;
        System.out.println("change:修改之后age = "+obj.age);
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.age = 5;
        System.out.println("修改之前age = "+obj.age);//5
        change(obj);
        //修改之前age=0,修改之后age=3
        System.out.println("修改之后age = "+obj.age);//5
    }
    //原因：change函数中新建了一个obj，两个obj运行在不同的堆之中
}
