import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args){
        try{
            //建立Socket服务
            Socket socket=new Socket("127.0.0.1",52304);
            System.out.println("The server has been connected......");
            OutputStream os=socket.getOutputStream();
            //接收服务器发送的文件
            InputStream is=socket.getInputStream();
            FileOutputStream fos=new FileOutputStream("D:/Document/MVN/HandTest/JavaTest2/Exam2/tmp/SampleChapter1.pdf");
            byte input[]=new byte[10000];
            int len=0;
            while((len=is.read(input))!=-1){
                fos.write(input,0,len);
                fos.flush();
            }
            System.out.println("File preservation success......");
            os.close();
            is.close();
            fos.close();
            socket.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
