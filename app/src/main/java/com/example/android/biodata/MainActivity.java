 package com.example.android.biodata;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxstatus;
    RadioButton rbmale, rbfemale;
    Switch swGrade;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxstatus = findViewById(R.id.checkBoxstatus);
        rbmale = findViewById(R.id.rbmale);
        rbfemale = findViewById(R.id.rbfemale);
        swGrade = findViewById(R.id.switchGrade);
        tvDisplay = findViewById(R.id.tvResult);
    }




    public void buCheck(View view) {

        // Alert

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Are you sure to save")
                .setTitle("Confirmation")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String Result = "";
                        if (checkBoxstatus.isChecked()) {
                            Result = "  He is married";
                        } else {
                            Result = "  He is not married";
                        }
                        if ((rbmale.isChecked())) {
                            Result += "  Also he is male";
                        } else {
                            Result += "  Also she is female";
                        }
                        if (swGrade.isChecked()) {
                            Result += "  Also student is grade";
                        } else {
                            Result += "  Also student is not grade";
                        }

                        tvDisplay.setText(Result);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Again give input", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    public void buCheck(View view) {

        // Alert

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Are you sure to save")
                .setTitle("Confirmation")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String Result = "";
                        if (checkBoxstatus.isChecked()) {
                            Result = "  He is married";
                        } else {
                            Result = "  He is not married";
                        }
                        if ((rbmale.isChecked())) {
                            Result += "  Also he is male";
                        } else {
                            Result += "  Also she is female";
                        }
                        if (swGrade.isChecked()) {
                            Result += "  Also student is grade";
                        } else {
                            Result += "  Also student is not grade";
                        }

                        tvDisplay.setText(Result);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Again give input", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }


}



