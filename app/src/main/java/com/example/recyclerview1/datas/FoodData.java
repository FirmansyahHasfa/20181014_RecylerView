package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "milo magma lava",
            "dark choco magma",
            "dark choco cheesy",
            "authentic milk vanilla blue",

    };

    private static String [] foodPrice = {
            "20000",
            "25000",
            "22000",
            "23000",

    };

    private static int [] foodImage = {
            R.drawable.milo,
            R.drawable.magma,
            R.drawable.cheesy,
            R.drawable.vanilla,

    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Food food = new Food(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
