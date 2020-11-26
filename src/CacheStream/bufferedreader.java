package CacheStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class bufferedreader {

    public void TestBufferedReader(){
        File file = new File("d:/lol.txt");  //创建要处理的文件

        try (
            FileReader fileReader = new FileReader(file);   //缓存流需要建立在已有的流之上
            BufferedReader bufferedReader = new BufferedReader(fileReader);  //建立缓存流
        ){
            while (true){
                String line = bufferedReader.readLine();   //用缓存流读入一行数据
                if (null == line)
                    break;
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
