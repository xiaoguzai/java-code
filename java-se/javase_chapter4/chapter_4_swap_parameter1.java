package javase_chapter4;

public class chapter_4_swap_parameter1 {
    public void swap(int a,int b)
    {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法里，a的值是"+a+";b的值是"+b);
    }

    public static void main(String[] args) {
        chapter_4_swap_parameter1 test = new chapter_4_swap_parameter1();
        int a = 5;
        int b = 10;
        test.swap(a,b);
        System.out.println("交换结束后，变量a的值是"+a+";变量b的值是"+b);
    }
    //局部变量，交换失败
}
