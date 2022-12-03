package javase_chapter8;

/***
 * static为类的初始化变量，只在类的初始化过程中启动一次
 * 这里为了避免对instance的反复初始化，因此使用锁锁上
 */
class Singleton{
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        //static可以直接通过类进行调用，比如Singleton.getInstance()
        if(instance == null)
        {
            synchronized (Singleton.class)
            {
                if(instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class lazy_person {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
