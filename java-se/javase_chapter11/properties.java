package javase_chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[] args) {
        Properties pros = new Properties();
        try {
            pros.load(new FileInputStream("D:\\FlinkProject\\javatry\\src\\main\\java\\javase_chapter11\\jdbc.properties"));
            String user = pros.getProperty("name");
            System.out.println(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
