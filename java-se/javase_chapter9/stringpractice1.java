package javase_chapter9;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class stringpractice1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        date = new Date(234234235235L);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH,8);
        System.out.println("当前时间日设置为8后，时间是："+calendar.getTime());
        calendar.add(Calendar.HOUR,2);
        System.out.println("当前时间加2小时后，时间是："+calendar.getTime());
        calendar.add(Calendar.MONTH,-2);
        System.out.println("当前日期减2个月后，时间是："+calendar.getTime());
    }
}
