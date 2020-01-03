package com.ctdworld.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import androidx.annotation.Nullable;

import com.ctdworld.myapplication.customviews.CustomButton;

public class Pop extends Activity {

    CustomButton btn_Ideclare;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width= dm.widthPixels;
        int height= dm.heightPixels;

        getWindow().setLayout((int )(width *.8),(int)(height *.6));

        btn_Ideclare=(CustomButton)findViewById(R.id.btn_Ideclare);
        btn_Ideclare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pop.this,Main4Activity.class));
            }
        });
    }
}
