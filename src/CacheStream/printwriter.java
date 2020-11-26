package CacheStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriter {

    public void TestPrintWriter(){
        File file = new File("d:/lol.txt");
        try (
                FileWriter fw = new FileWriter(file,true);  // 创建文件字符流
                PrintWriter pw = new PrintWriter(fw)  // 缓存流必须建立在一个存在的流的基础上
        ) {
            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
