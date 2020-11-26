package ObjectStream;

import java.io.*;

public class objectstream {

    public void TestObjectStream(){
        //创建一个对象
        Hero hero = new Hero();
        hero.name = "hero1";
        hero.hp = 12;

        File file = new File("d:/lol1.txt");
        try (
            //创建对象输出流，把hero对象输出到文件中
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //创建对象输入流，把序列化的对象从文件中输入到内存
            FileInputStream fileinputstream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileinputstream)
        ){
            objectOutputStream.writeObject(hero);  //调用对象输出流，将hero对象输出到文件
            Hero hero1 = (Hero) objectInputStream.readObject();  //创建一个新的对象，用来接收对象输入流输入的数据
            System.out.println(hero1.name);
            System.out.println(hero1.hp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
