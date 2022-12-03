package javase_chapter10;

class Season{
    private final String SEASONNAME;//季节名称
    private final String SEASONDESC;

    Season(String SEASONNAME,String SEASONDESC) {
        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }

    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINDER = new Season("冬天","白雪皑皑");

    public String getSEASONNAME()
    {
        return this.SEASONNAME;
    }

    public String getSEASONDESC()
    {
        return this.SEASONDESC;
    }

    public String toString()
    {
        return "Season{"+this.SEASONNAME+"\'"+",seasonDesc="+this.SEASONDESC+"\'"+'}';
    }
}

public class originalnumerate {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.toString());
    }
}
