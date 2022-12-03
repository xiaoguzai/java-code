package javase_chapter5;

class Base
{
    int count = 10;
    public void display()
    {
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}

public class multimodality3 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        //类没有浅拷贝，都是深拷贝
        System.out.println(b == s);//true
        System.out.println(b.count);//10
        b.display();//20
    }
}
