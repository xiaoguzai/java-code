package javase_chapter7;
class Division extends Exception{
    public int divide (int a,int b) throws Exception {
        if(a < 0)
        {
            throw new Exception("被除数为负，不合理");
        }
        else if(b < 0)
        {
            throw new Exception("除数为负，不合理");
        }
        else
        {
            return a/b;
        }
    }
}

public class practice {
    public static void main(String[] args) throws Exception {
        Division division = new Division();
        int result = division.divide(-3,-5);
    }
}
