package com.ctdworld.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ctdworld.myapplication.customviews.CustomButton;
import com.ctdworld.myapplication.customviews.CustomEditText;
import com.ctdworld.myapplication.customviews.CustomTextView;


public class Main2Activity extends AppCompatActivity {
    ImageView ivBack;
    RelativeLayout btnAction;
    CustomButton btn_next;
    CustomEditText et_DeactivationDate,et_onBoardingDate,et_special_instructions,et_remarks,et_team_member,et_team,et_designation,et_personal_name,et_merchantType,et_website;
    CustomTextView txt_Heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_DeactivationDate=(CustomEditText)findViewById(R.id.et_DeactivationDate);
        et_onBoardingDate=(CustomEditText)findViewById(R.id.et_onBoardingDate);
        et_special_instructions=(CustomEditText)findViewById(R.id.et_special_instructions);
        et_remarks=(CustomEditText)findViewById(R.id.et_remarks);
        et_team_member=(CustomEditText)findViewById(R.id.et_team_member);
        et_team=(CustomEditText)findViewById(R.id.et_team);
        et_designation=(CustomEditText)findViewById(R.id.et_designation);
        et_personal_name=(CustomEditText)findViewById(R.id.et_personal_name);
        et_merchantType=(CustomEditText)findViewById(R.id.et_merchantType);
        et_website=(CustomEditText)findViewById(R.id.et_website);
        txt_Heading=(CustomTextView)findViewById(R.id.txt_Heading);


        ivBack =  findViewById(R.id.iv_back);

        btnAction =  findViewById(R.id.btn_action);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));

            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
        btn_next=(CustomButton)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }
        });

    }




    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }
}
