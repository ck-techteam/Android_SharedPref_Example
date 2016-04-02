package com.codekhadi.sharedpref_example;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_name;
    Button btn_click,btn_retrive;
    TextView txt_show;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedpreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        edt_name = (EditText) findViewById(R.id.edt_name);
        btn_click = (Button) findViewById(R.id.btn_click);
        btn_retrive = (Button) findViewById(R.id.btn_retrive);

        txt_show = (TextView) findViewById(R.id.txt_show);


        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edt_name.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("Name", name);
                editor.commit();
            }
        });
        btn_retrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_name.setText(sharedpreferences.getString("Name", ""));
            }
        });

    }
}
