package ObjectStream;

import java.io.Serializable;

public class Hero implements Serializable {
    //把一个对象序列化有一个前提是：这个对象的类，必须实现了Serializable接口
    public String name;
    public float hp;
}
