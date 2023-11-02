package com.example.sjcet.qus4c2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.app.Activity;

public class MainActivity extends Activity {

    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
    }

    public void toggleImage(View view) {
        if (imageView1.getVisibility() == View.VISIBLE) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
        } else {
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        }
    }
}
