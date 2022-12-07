package javase_chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class load_properties {
    public static void main(String[] args) throws IOException {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("D:\\FlinkProject\\javatry\\src\\main\\resources\\jdbc.properties");
        pros.load(fis);

        //读取配置文件的方式一：
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(user);
        System.out.println(password);
        System.out.println("user = "+user+" password = "+password);

        //读取配置文件方式二：使用classLoader
        //配置文件默认识别为当前module的src下，此种方式代码运行存在问题
        /***
        ClassLoader classLoader = load_properties.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("D:\\FlinkProject\\javatry\\src\\main\\resources\\jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);
        String user1 = properties.getProperty("user");
        String password1 = properties.getProperty("password");
        System.out.println(user1);
        System.out.println(password1);
        System.out.println("user = "+user1+" password = "+password1);
         ***/
    }
}
