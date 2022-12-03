package javase_chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class reverse_str {
    public static void main(String[] args) {
        Date date = new Date();//产生一个Date实例
        SimpleDateFormat formater = new SimpleDateFormat();
        System.out.println(formater.format(date));
        //打印输出默认格式日期
        SimpleDateFormat formater2 = new SimpleDateFormat("yyyy年MM月dd日 EEEHH:mm:ss");
        System.out.println(formater2.format(date));
        Date date2 = null;
        try {
            date2 = formater2.parse("2008年08月08日 星期一 08:08:08");
            System.out.println(date2.toString());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
