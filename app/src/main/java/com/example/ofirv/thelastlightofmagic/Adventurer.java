package com.example.ofirv.thelastlightofmagic;

/**
 * Created by ofir on 12-Feb-18.
 */

public class Adventurer
{
    String name;
    int level;
    Stats stats;
    private final static int POINTS_PER_LEVEL = 15;
    int portrait;

    public Adventurer(Stats stats)
    {
        this.level = 1;
        this.stats = stats;
        levelUp();
    }

    @Override
    public String toString()//todo add about skills
    {
        return name +
                "\nlevel:" + level;
    }

    private void levelUp()
    {
        stats.levelUp(POINTS_PER_LEVEL);
    }
}
