package com.xaiyaphone.lab26sep;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Sample2Activity  extends AppCompatActivity {
    EditText editext;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2);
    }

    public void submitClick(View view){
        editext = (EditText) findViewById(R.id.edt_01);
        textView = (TextView) findViewById(R.id.texthere);

        textView.setText(editext.getText());
    }
}
