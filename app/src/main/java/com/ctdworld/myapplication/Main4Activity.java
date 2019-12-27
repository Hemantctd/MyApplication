package com.ctdworld.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ctdworld.myapplication.customviews.CustomButton;
import com.ctdworld.myapplication.customviews.CustomTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main4Activity extends AppCompatActivity {

    ImageView ivBack;
    RelativeLayout btnAction;
    CustomButton btn_submit;
    FloatingActionButton float1_pan,float2_cancelled_check,float3_gstCertificate,float4_adhaar;
    CustomTextView txt_adhaar,txt_gst_certificate,txt_cancelled_cheque,txt_pan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        float1_pan=(FloatingActionButton)findViewById(R.id.float1);
        float2_cancelled_check=(FloatingActionButton)findViewById(R.id.float2);

        ivBack = findViewById(R.id.iv_back);
        //  AppUtils.getInstance().hideKeyboard(this);


        btnAction = findViewById(R.id.btn_action);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
        btn_submit =(CustomButton)findViewById(R.id.btn_submit);
                btn_submit.setOnClickListener(new View.OnClickListener() {
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

