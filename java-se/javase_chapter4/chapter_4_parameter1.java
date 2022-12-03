package javase_chapter4;

public class chapter_4_parameter1 {
    public static void change(int x)
    {
        System.out.println("change:修改之前x = "+x);
        x = 3;
        System.out.println("change:修改之后x = "+x);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("修改之前x = "+x);//5
        //x是实参
        change(x);//修改之前x=5,修改之后x=3
        System.out.println("修改之后x = "+x);//5
        //原因：x作为局部变量存放在栈中，而main函数中的x调用的是另外一个栈
    }
}
