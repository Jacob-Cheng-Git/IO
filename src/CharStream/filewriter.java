package CharStream;

import java.io.File;
import java.io.FileWriter;

public class filewriter {

    public void TestFileWriter(){
        //字符输出流，把字符输出到硬盘

        File file = new File("d:/lol.txt");  //确定要输出的目标文件
        try (FileWriter fileWriter = new FileWriter(file,true)){  //创建字符输出流
            String data = "abcdefg123456";   //创建String数据
            char[] all = data.toCharArray();    //将String数据转化为字符数组
            fileWriter.write(all);   //通过字符流将字符数组中的数据写出到文件
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
