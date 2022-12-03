package javase_chapter5;

public class multimodality1 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);
        Object objPri = new Integer(5);
        String str = (String)objPri;
        //这里会报异常，原因Integer和String不是父子关系
    }
}
/**
 * Person为父，Student为子
 * 当父类被定义为子类的时候，可以调用
 * 子类的方法
 * Person e = new Student();
 * e.getInfo();
 *
 * instanceof查看一个类是否属于某个类
 *
 * 子类转到父类可以自动进行
 * 父类转到子类必须强制进行
 */
