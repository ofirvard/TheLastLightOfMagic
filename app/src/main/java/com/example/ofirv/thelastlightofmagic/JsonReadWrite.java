package com.example.ofirv.thelastlightofmagic;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by ofir on 13-Feb-18.
 */

public class JsonReadWrite
{
    private static String load(Context context, String file)//load from raw
    {
        String data = "";
        try
        {
            InputStream in = context.getResources().openRawResource(context.getResources().getIdentifier(file,
                    "raw", context.getPackageName()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            data = read(reader);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return data;
    }

    public static String getName(Context context, String file)
    {
        String in = JsonReadWrite.load(context, file);
        try
        {
            JSONArray nameList = new JSONArray(in);
            Random random = new Random();
            return nameList.getString(random.nextInt(nameList.length()));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        return "";
    }

    private static String read(BufferedReader reader)
    {
        try
        {
            StringBuilder builder = new StringBuilder();
            String aux;
            while ((aux = reader.readLine()) != null)
            {
                builder.append(aux);
            }
            return builder.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
}
