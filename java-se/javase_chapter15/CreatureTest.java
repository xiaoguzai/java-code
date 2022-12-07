package javase_chapter15;

import java.io.Serializable;
import java.util.Comparator;

class Creature<T> implements Serializable
{
    private char gender;
    public double weight;

    private void breath()
    {
        System.out.println("生物呼吸");
    }

    public void eat()
    {
        System.out.println("生物吃东西");
    }
}

public class CreatureTest extends Creature<String> implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
