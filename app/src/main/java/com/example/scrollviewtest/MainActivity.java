package com.example.scrollviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_find;
    Button btn_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_find = findViewById(R.id.btnFind);
        btn_txt = findViewById(R.id.btnTxt);

        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"進入搜尋頁面 icon",Toast.LENGTH_SHORT).show();
            }
        });

        btn_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"進入搜尋頁面 txt",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
