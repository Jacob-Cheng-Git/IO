package FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileinputstream {

    public void TestFileInputStream(){
        //字节输入流（FileInputStream是InputStream的子类）
        File file = new File("d:/lol.txt");
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream(file);
            //创建字节数组，其长度就是文件的长度
            byte[] bytes = new byte[(int)file.length()];   //不太理解
            fileInputStream.read(bytes);
            for (byte b : bytes){
                System.out.println(b);
            }
//            fileInputStream.close();    不推荐这样使用，因为当有异常发生时，该条代码就会无法实现
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (null != fileInputStream)
                try {
                    fileInputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
        }
    }
}
