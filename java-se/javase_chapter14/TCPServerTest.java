package javase_chapter14;

import javase_chapter13.ByteArrayOutputStreamTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8899);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        /***
         * 不建议这样写，可能会有乱码
         * byte[] buffer = new byte[50];
         * //这里面开的大一点，因为中文一个占三个
         * int len;
         * while((len = is.read(buffer)) != -1)
         * {
         *  String str = new String(buffer,0,len);
         *  System.out.println(str);
         *  }
         ***/

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[5];
        int len;
        while((len = is.read(buffer)) != -1)
        {
            baos.write(buffer,0,len);
        }
        System.out.println(baos.toString());
        //此时这个数据不会把独立的五个还原成字符串
        //而是整体上进行还原
        System.out.println("收到了来自于"+socket.getInetAddress().getHostAddress()+"的数据");

        //关闭资源
        baos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
