package com.ctdworld.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ctdworld.myapplication.customviews.CustomButton;
import com.ctdworld.myapplication.customviews.CustomTextView;
import com.ctdworld.myapplication.fragment.AdhaarFragment;
import com.ctdworld.myapplication.fragment.CancelledChequeFragment;
import com.ctdworld.myapplication.fragment.GstCertificateFragment;
import com.ctdworld.myapplication.fragment.PanFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main4Activity extends AppCompatActivity {

    ImageView ivBack;
    RelativeLayout btnAction;
    CustomButton btn_submit;
    FloatingActionButton float1_pan,float2_cancelled_check,float3_gstCertificate,float4_adhaar;
    CustomTextView txt_adhaar,txt_gst_certificate,txt_cancelled_cheque,txt_pan;
    RelativeLayout rel_pan,rel_cancelledCheque,rel_gstCertificate,rel_Adhaar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        rel_pan=(RelativeLayout)findViewById(R.id.rel_pan);
        rel_cancelledCheque=(RelativeLayout)findViewById(R.id.rel_cancelledCheque);
        rel_gstCertificate=(RelativeLayout)findViewById(R.id.rel_gstCertificate);
        rel_Adhaar=(RelativeLayout)findViewById(R.id.rel_Adhaar);

        float1_pan=(FloatingActionButton)findViewById(R.id.float1);
        float2_cancelled_check=(FloatingActionButton)findViewById(R.id.float2);
        float3_gstCertificate=(FloatingActionButton)findViewById(R.id.float3);
        float4_adhaar=(FloatingActionButton)findViewById(R.id.float4);


        txt_adhaar=(CustomTextView)findViewById(R.id.txt_adhaar);
        txt_gst_certificate=(CustomTextView)findViewById(R.id.txt_gst_certificate);
        txt_cancelled_cheque=(CustomTextView)findViewById(R.id.txt_cancelled_cheque);
        txt_pan=(CustomTextView)findViewById(R.id.txt_pan);

        //Pan fragment
        rel_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, PanFragment.class));
            }
        });
        float1_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, PanFragment.class));
            }
        });
        txt_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, PanFragment.class));
            }
        });

        //cancelled check fragment
        rel_cancelledCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, CancelledChequeFragment.class));
            }
        });
        float2_cancelled_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, CancelledChequeFragment.class));
            }
        });
        txt_cancelled_cheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, CancelledChequeFragment.class));
            }
        });

        //gst certificate Fragment
        rel_gstCertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, GstCertificateFragment.class));
            }
        });
        float3_gstCertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, GstCertificateFragment.class));
            }
        });
        txt_gst_certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, GstCertificateFragment.class));
            }
        });

        //Adhaar Fragment

        rel_Adhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, AdhaarFragment.class));
            }
        });
        float4_adhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, AdhaarFragment.class));
            }
        });
        txt_adhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, AdhaarFragment.class));
            }
        });



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

