package javase_chapter4;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

class Valuedata
{
    int i = 15;
}

public class chapter_4_swap_parameter3 {
    public static void main(String[] args) {
        chapter_4_swap_parameter3 test = new chapter_4_swap_parameter3();
        test.first();
    }
    public void first()
    {
        int i = 5;
        Valuedata v = new Valuedata();
        v.i = 25;
        second(v,i);
        System.out.println(v.i);
    }
    public void second(Valuedata v,int i)
    {
        i = 0;
        v.i = 20;
        Valuedata val = new Valuedata();
        v = val;
        System.out.println(v.i + " " + i);
    }
}
