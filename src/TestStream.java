import CacheStream.bufferedreader;
import CacheStream.printwriter;
import CharStream.filereader;
import CharStream.filewriter;
import DataStream.datastream;
import FileStream.fileinputstream;
import FileStream.fileoutputstream;
import ObjectStream.objectstream;

import java.util.Scanner;

public class TestStream {

    public static void main(String[] args) {
       //测试字节输入流，把数据输入到内存
        System.out.println("测试字节输入流");
        fileinputstream inputstream = new fileinputstream();
        inputstream.TestFileInputStream();

        //测试字节输出流，把数据输出到硬盘
        System.out.println("测试字节输出流");
        fileoutputstream outputstream = new fileoutputstream();
        outputstream.TestFileOutputStream();

        //测试字符输入流
        System.out.println("测试字符输入流");
        filereader filereader = new filereader();
        filereader.TestFileReader();

        //测试字符输出流
        System.out.println("测试字符输出流");
        filewriter filewriter = new filewriter();
        filewriter.TestFileWriter();

        //测试缓存流BufferedReader
        System.out.println("测试缓存流BufferedReader");
        bufferedreader bufferedreader = new bufferedreader();
        bufferedreader.TestBufferedReader();

        //测试缓存字符输出流PrintWriter
        System.out.println("测试缓存字符输出流PrintWriter");
        printwriter printwriter = new printwriter();
        printwriter.TestPrintWriter();

        //测试数据流
        System.out.println("测试数据流DataStream");
        datastream datastream = new datastream();
        datastream.write();
        datastream.read();

        //测试对象流
        System.out.println("测试对象流ObjectStream");
        objectstream objectstream = new objectstream();
        objectstream.TestObjectStream();


        //Scanner键盘输入
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
    }

}
