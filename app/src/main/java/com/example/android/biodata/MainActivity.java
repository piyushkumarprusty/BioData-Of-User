package com.example.android.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
CheckBox checkBoxstatus;
RadioButton rbmale , rbfemale ;
Switch swGrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxstatus = findViewById(R.id.checkBoxstatus);
        rbmale = findViewById(R.id.rbmale);
        rbfemale = findViewById(R.id.rbfemale);
        swGrade = findViewById(R.id.switchGrade);

    }

    public void bucheck(View view) {
    }
}