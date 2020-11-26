import java.io.*;

public class datastream {

    public void write(){
        File file = new File("d:/lol.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);   //数据流得建立在一个流的基础上
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)   //建立数据流
        ){
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(300);
            dataOutputStream.writeUTF("this is DataStream");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void read(){
        //要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，
        // 否则会出现EOFException，因为DataOutputStream 在写出的时候会做一些特殊标记，
        // 只有DataInputStream 才能成功的读取。
        File file = new File("d:/lol.txt");
        try (
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream)
        ){
            boolean b = dataInputStream.readBoolean();
            int i = dataInputStream.readInt();
            String s = dataInputStream.readUTF();

            System.out.println(b);
            System.out.println(i);
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
