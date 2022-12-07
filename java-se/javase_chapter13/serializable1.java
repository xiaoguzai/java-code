package javase_chapter13;

import java.io.*;

class Person implements Serializable{
    public static final long serialVersionUID = 475463534532L;

    private String name;
    private int age;
    private int id;
    public Person(String name,int age,int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{"+
                "name='"+name+'\''+
                ",age="+age+'}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class serializable1 {
    public static void main(String[] args) {
        //        序列化
        Person p = new Person("hello",11,12);
//        指定文件生成输出流
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("person.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        将对象写出到指定的输出流
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        将指定的对象写入ObjectOutputStream。
        try {
            oos.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        刷新流
        try {
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //        反序列化
//        根据指定文件生产输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("person.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        从指定的输入流中读回对象消息
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        从ObjectInputStream读取一个对象
        p = null;
        try {
            p = (Person) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p.toString());

    }
}
