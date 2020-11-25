import java.io.File;
import java.io.FileReader;

public class filereader {

    public void TestFileReader(){
        //FileReader是Reader的子类

        File file = new File("d:/lol.txt");   //创建文件
        try (FileReader fileReader = new FileReader(file)){   //创建字符流
            char[] all = new char[(int)file.length()];   //创建字符数组，长度为file文件的长度
            fileReader.read(all);   //用字符流将数据读入到字符数组中
            for (char a : all){
                System.out.println(a);  //打印字符数组
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
