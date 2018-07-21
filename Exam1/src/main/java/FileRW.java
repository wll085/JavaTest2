import java.io.*;

public class FileRW {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("D:/Document/MVN/HandTest/JavaTest2/Exam1/SampleChapter1.pdf");
            BufferedInputStream bis=new BufferedInputStream(fis,1000);
            FileOutputStream fos=new FileOutputStream("D:/Document/MVN/HandTest/JavaTest2/Exam1/tmp/SampleChapter1.pdf");
            BufferedOutputStream bos=new BufferedOutputStream(fos,1000);
            byte input[]=new byte[10000];
            while(bis.read(input)!=-1){
                bos.write(input);
            }
            System.out.println("Read and write file success");
            bos.close();
            bis.close();
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
