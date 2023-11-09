package com.example.sjcet.c2q1;

import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText name, age, email, password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edit1);
        age = findViewById(R.id.edit2);
        email = findViewById(R.id.edit3);
        password = findViewById(R.id.edit4);
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("name", "");
        int a = sh.getInt("age", 0);
        String s2 = sh.getString("email", "");
        String s3 = sh.getString("password", "");

        name.setText(s1);
        age.setText(String.valueOf(a));
        email.setText(s2);
        password.setText(s3);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",
                MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("name", name.getText().toString());
        myEdit.putInt("age", Integer.parseInt(age.getText().toString()));
        myEdit.putString("email", email.getText().toString());
        myEdit.putString("password", password.getText().toString());
        myEdit.apply();
    }
}
