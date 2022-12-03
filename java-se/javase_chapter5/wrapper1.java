package javase_chapter5;

public class wrapper1 {
    public static void main(String[] args) {
        Object o1 = true?new Integer(1):new Double(2.0);
        System.out.println(o1);

        Object o2;
        if(true)
        {
            o2 = new Integer(1);
        }
        else
        {
            o2 = new Double(2.0);
        }
        System.out.println(o2);
    }
}
