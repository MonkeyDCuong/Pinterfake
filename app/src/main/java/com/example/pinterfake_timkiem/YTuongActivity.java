package com.example.pinterfake_timkiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class YTuongActivity extends AppCompatActivity {
    private ImageView imageViewAnh;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ytuong);

        btnBack = (Button) findViewById(R.id.imgBt_back_Bonghoacodon);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(YTuongActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imageViewAnh = (ImageView) findViewById(R.id.img1);
        imageViewAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YTuongActivity.this,AnhActivity.class);
                startActivity(intent);
            }
        });

    }
}