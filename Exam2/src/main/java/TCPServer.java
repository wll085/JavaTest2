import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(52304);   //建立服务端socket
        Socket socket=serverSocket.accept();   //接收客户端socket
        OutputStream os=socket.getOutputStream();   //读取本地文件发送给客户端
        InputStream fis=new FileInputStream("D:/Document/MVN/HandTest/JavaTest2/Exam1/tmp/SampleChapter1.pdf");
        byte input[]=new byte[10000];
        int len=0;
        while((len=fis.read(input))!=-1){
            os.write(input,0,len);
            os.flush();
        }
        System.out.println("Server side receiving data success");
        os.close();
        fis.close();
        socket.close();
        serverSocket.close();
    }
}
