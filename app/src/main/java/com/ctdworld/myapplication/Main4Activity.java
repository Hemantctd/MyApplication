package com.ctdworld.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ctdworld.myapplication.customviews.CustomButton;

public class Main4Activity extends AppCompatActivity {

    ImageView ivBack;
    RelativeLayout btnAction;
    CustomButton btn_Submit;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main4);
            ivBack =  findViewById(R.id.iv_back);
          //  AppUtils.getInstance().hideKeyboard(this);


            btnAction =  findViewById(R.id.btn_action);

            ivBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();

                }
            });

            btn_Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }




        @Override
        public void onBackPressed() {

            super.onBackPressed();

        }
    }

