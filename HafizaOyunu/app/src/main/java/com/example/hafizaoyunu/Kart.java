package com.example.hafizaoyunu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;

import androidx.appcompat.widget.AppCompatDrawableManager;

public class Kart extends Button {

    boolean acikMi = false;
    int resimId;
    int arkaPlanId=0;
    int onPlanId=0;
    Drawable on;
    Drawable arka;

    public Kart(Context context, int id) {
        super(context);
        arkaPlanId = R.drawable.arka;
        if(id%8==1)
            onPlanId = R.drawable.c1;
        if(id%8==2)
            onPlanId = R.drawable.c2;
        if(id%8==3)
            onPlanId = R.drawable.c3;
        if(id%8==4)
            onPlanId = R.drawable.c4;
        if(id%8==5)
            onPlanId = R.drawable.c5;
        if(id%8==6)
            onPlanId = R.drawable.c6;
        if(id%8==7)
            onPlanId = R.drawable.c7;
        if(id%8==0)
            onPlanId = R.drawable.c8;

        arka = AppCompatDrawableManager.get().getDrawable(context,arkaPlanId);
        on = AppCompatDrawableManager.get().getDrawable(context,onPlanId);
        setBackground(arka);

    }

    public void cevir() {
        if(!acikMi){
            //kapali ise
            setBackground(on);
            acikMi = true;
        } else {
            setBackground(arka);
            acikMi = false;
        }
    }

}
