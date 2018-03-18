package com.example.ofirv.thelastlightofmagic;

import android.content.Context;

import java.util.Random;

/**
 * Created by ofir on 12-Feb-18.
 */

public class Paladin extends Adventurer
{
    public Paladin(Context context)
    {
        super(new Stats(new int[]{3, 3, 3, 3, 3, 1, 1}));

        Random random = new Random();
        int[] imgs = new int[]{R.drawable.portrait_pf00,
                R.drawable.portrait_pf01,
                R.drawable.portrait_pf02,
                R.drawable.portrait_pf03,
                R.drawable.portrait_pf04,
                R.drawable.portrait_pm00,
                R.drawable.portrait_pm01,
                R.drawable.portrait_pm02,
                R.drawable.portrait_pm03,
                R.drawable.portrait_pm04};

        int randomNum = random.nextInt(imgs.length);
        portrait = imgs[randomNum];

        if (randomNum > 4)//male
            name = JsonReadWrite.getName(context, "male");
        else
            name = JsonReadWrite.getName(context, "female");

    }
}