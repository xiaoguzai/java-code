package javase_chapter14;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientTest {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("192.168.1.7");
            //这里的ip=127.0.0.1为对方的，但是这里设置环回地址本质上还是自己的
            //InetAddress address_2 = InetAddress.getLocalHost();
            //System.out.println(address_2);//DESKTOP-VIA9J7O/192.168.1.17
            //这里的192.168.1.17为本地的ip地址

            Socket socket = new Socket(inet,8899);
            OutputStream os = socket.getOutputStream();
            os.write("你好，我是客户端mm".getBytes());

            //资源关闭
            os.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //包住这段代码的快捷键：alt+shift+z
    }
}
