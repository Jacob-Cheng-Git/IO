package FileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream {
    public void TestFileOutputStream(){

        //字节输出流
        File f = new File("d:/lol.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f,true);//true是在文件末尾添加数据，false是直接覆盖原理的数据
            byte data[] = { 99,100 };
            fileOutputStream.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileOutputStream != null)
                try {
                    fileOutputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
        }
    }
}
