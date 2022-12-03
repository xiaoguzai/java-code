package javase_chapter10;

interface info{
    void show();
}

enum SeasonEnum implements info{

    SPRING("春天","春风又绿江南岸"){
        @Override
        public void show(){
            System.out.println("这是一个春天");
        }
    },
    SUMMER("夏天","映日荷花别样红"){
        @Override
        public void show(){
            System.out.println("这是一个夏天");
        }
    },
    AUTUMN("秋天","秋水共长天一色"){
        @Override
        public void show(){
            System.out.println("这是一个秋天");
        }
    },
    WINTER("冬天","窗含西岭千秋雪"){
        @Override
        public void show(){
            System.out.println("这是一个冬天");
        }
    };
    private final String seasonName;
    private final String seasonDesc;
    private SeasonEnum(String seasonName,String seasonDesc)
    {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName(){
        return seasonName;
    }

    public String getSeasonDesc(){
        return seasonDesc;
    }

    public String toString(){
        return "Season{"+seasonName+"seasonName"+"\'"+
                ",seasonDesc="+seasonDesc+"\'"+"}";
    }

    /***
    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
    ***/
}

public class newnumerate {
    public static void main(String[] args) {
        SeasonEnum spring = SeasonEnum.SPRING;
        System.out.println(spring.toString());
        spring.show();
    }
}
