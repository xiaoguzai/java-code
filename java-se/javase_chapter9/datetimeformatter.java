package javase_chapter9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public class datetimeformatter {
    public static void main(String[] args) {
        //方法一：预定义的标准格式
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);//2022-11-30T09:02:42.337,使用ISO_LOCAL_DATE_TIME格式
        System.out.println(str1);//2022-11-30T09:02:42.337

        //解析：字符串-->日期
        TemporalAccessor parse = formatter.parse("2019-02-18T15:42:18.797");
        System.out.println(parse);//{},ISO resolved to 2019-02-18T15:42:18.797

        //方法二：本地化相关的格式，如：ofLocalizedDateTime(FormatStyle.LONG)
        //FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHOT:适用于LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//22-11-30 上午9:02

        //本地化相关的格式，如ofLocalizedDate()
        //FormatStyle.FULL/FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT:适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//2022年11月30日 星期三

        //(重点)方式三：自定义格式，如：ofPattern("yyyy-MM-dd hh:mm:ss E")
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2022-11-30 09:02:42

        //解析
        TemporalAccessor parse1 = formatter3.parse("2022-11-30 09:02:42");
        System.out.println(parse1);
        //{MinuteOfHour=2, MilliOfSecond=0, HourOfAmPm=9, MicroOfSecond=0, SecondOfMinute=42, NanoOfSecond=0},ISO resolved to 2022-11-30
    }
}
