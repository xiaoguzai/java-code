package javase_chapter14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientPictureTest {
    public static void main(String[] args) throws IOException {
        //1.造socket
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        //2.获取输出流
        OutputStream os = socket.getOutputStream();
        //3.获取输入流
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\47455\\Pictures\\截图.jpg"));
        //4.读写过程
        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1)
        {
            os.write(buffer,0,len);
        }
        //5.服务器关闭
        fis.close();
        os.close();
        socket.close();
    }
}
