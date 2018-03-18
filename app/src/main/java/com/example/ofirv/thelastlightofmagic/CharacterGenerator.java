package com.example.ofirv.thelastlightofmagic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterGenerator extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_generator);

        //portrait
        Paladin paladin = new Paladin(getApplicationContext());
        ((ImageView) findViewById(R.id.portrait)).setImageResource(paladin.portrait);

        //stats
        ((TextView) findViewById(R.id.stats)).setText(paladin.stats.toString());

        //info
        ((TextView) findViewById(R.id.info)).setText(paladin.toString());
    }
}
