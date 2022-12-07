package javase_chapter14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_try {
    public static void main(String[] args) {
        try {
            InetAddress address_1 = InetAddress.getByName("www.baidu.com");
            System.out.println(address_1);//对象所含的域名+IP地址 www.baidu.com/112.80.248.75
            System.out.println(address_1.getHostName());//对象所含的域名：www.baidu.com
            System.out.println(address_1.getHostAddress());//对象所含的ip地址：112.80.248.75

            InetAddress address_2 = InetAddress.getLocalHost();
            System.out.println(address_2);//DESKTOP-VIA9J7O/192.168.1.100
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
