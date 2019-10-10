package com.xaiyaphone.lab26sep;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Sample1Activity<buttonClick> extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
    public void buttoncClick(View view){
        textview = (TextView) findViewById(R.id.txt1);
        textview.setText("ສະບາຍດີAndroid ");
    }
}
