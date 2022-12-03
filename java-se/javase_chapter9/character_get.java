package javase_chapter9;

import java.io.UnsupportedEncodingException;
import java.time.*;

public class character_get {
    public static void main(String[] args) {
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2022-11-29T13:59:36.061Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2022-11-29T22:16:24.172+08:00

        //toEpochMilli():获取1970年1月1日0时0分0秒(UTC)开始的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);//1669731384172

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例 -->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1550475314878L);
        System.out.println(instant1);//2019-02-18T07:35:14.878Z
    }
}
