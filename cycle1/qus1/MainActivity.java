package com.example.sjcet.qus1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ED1,ED2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ED1=findViewById(R.id.ed1);
        ED2=findViewById(R.id.ed2);
    }

    public void click(View view) {

        String s1=ED1.getText().toString();
        String s2=ED2.getText().toString();
        if(s1.equals("admin")&&s2.equals("admin"))

            Toast.makeText(this, "Valid Credentials", Toast.LENGTH_SHORT).show();

        else {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
        }
    }
}