package javase_chapter10;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

@interface MyAnnotation{
    String value() default "auguigu";
}


@MyAnnotation(value = "下硅谷")

public class annotationdefine {
    public static void main(String[] args) {
        String[] str = new String[5];
        for(String myStr:str)
        {
            myStr = "atguigu";
            System.out.println(myStr);
        }
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
}
