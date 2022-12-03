package javase_chapter5;

class Creature{
    public Creature(){
        System.out.println("Creature无参数的构造器");
    }
}

class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal带一个参数的构造器，该动物的name为"+name);
    }
    public Animal(String name,int age){
        this(name);
        System.out.println("Animal带两个参数的构造器，其age为"+age);
    }
}


public class this_use {
    public static void main(String[] args) {
        new Wolf();
    }
    /***
     * Wolf必须自成一个文档，原因在于Wolf为公共类
     * Wolf前面定义了public class Wolf extends Animal
     * 运行结果：
     * Creature无参数的构造器
     * Animal带一个参数的构造器，该动物的name为灰太狼
     * Animal带两个参数的构造器，其age为3
     * Wolf无参数的构造器
     * 很好理解
     */
}
