package javase_chapter4;

import javax.xml.crypto.Data;

class DataSwap{
    public int a;
    public int b;
}
public class chapter_4_swap_parameter2 {
    public static void swap(DataSwap ds)
    {
        int temp = ds.a;
        ds.a = ds.b;
        ds.b = temp;
        System.out.println("swap方法里，a Field的值是"+ds.a+";b Field的值是"+ds.b);
    }

    public static void main(String[] args) {
        DataSwap ds = new DataSwap();
        ds.a = 5;
        ds.b = 10;
        swap(ds);
        System.out.println("交换结束后，a Field的值是"+ds.a+";b Field的值是"+ds.b);
    }
    //因为变量存放在堆之中，因此交换完成之后可以保存变量
}
