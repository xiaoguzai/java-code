package javase_chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLtest {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        FileOutputStream fos = null;
        HttpURLConnection urlConnection = null;
        try
        {
            URL url = new URL("http://localhost:8080/examples/catch.jpg");
            //URLConnection urlConnection = url.openConnection();
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("D:\\beauty.jpg");
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1)
            {
                fos.write(buffer,0,len);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            is.close();
            fos.close();
            urlConnection.disconnect();
        }
    }
}
