package com.example.ofirv.thelastlightofmagic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ofir on 13-Feb-18.
 */

public class Stats
{
    Stat[] stats = new Stat[7];

    public Stats(int[] stats)
    {
        this.stats[0] = new Stat("Health", stats[0]);
        this.stats[1] = new Stat("Aggro", stats[1]);
        this.stats[2] = new Stat("Strength", stats[2]);
        this.stats[3] = new Stat("Intellect", stats[3]);
        this.stats[4] = new Stat("Wisdom", stats[4]);
        this.stats[5] = new Stat("Dexterity", stats[5]);
        this.stats[6] = new Stat("Agility", stats[6]);
    }

    public void levelUp(int points)
    {
        Random random = new Random();
        ArrayList<Stat> temp = new ArrayList<>();
        for (Stat stat : stats)
            for (int i = 0; i < stat.growth; i++)
                temp.add(stat);

        for (int i = 0; i < points; i++)
            temp.get(random.nextInt(temp.size())).value++;
    }

    public int health()
    {
        return stats[0].value;
    }

    public int aggro()
    {
        return stats[1].value;
    }

    public int strength()
    {
        return stats[2].value;
    }

    public int intellect()
    {
        return stats[3].value;
    }

    public int wisdom()
    {
        return stats[4].value;
    }

    public int dexterity()
    {
        return stats[5].value;
    }

    public int agility()
    {
        return stats[6].value;
    }

    @Override
    public String toString()
    {
        return "HLT" + health()
                + "\nAGG" + aggro()
                + "\nSTR" + strength()
                + "\nINT" + intellect()
                + "\nWIS" + wisdom()
                + "\nDEX" + dexterity()
                + "\nAGI" + agility();
    }

    class Stat
    {
        int value = 3;
        int growth;
        String name;

        public Stat(String name, int growth)
        {
            this.growth = growth;
            this.name = name;
        }
    }
}
