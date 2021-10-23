package com.example.pinterfake_timkiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Share_Activity extends AppCompatActivity {
    private ImageButton close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        close = (ImageButton) findViewById(R.id.imgBt_back_Share);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Share_Activity.this,AnhActivity.class);
                startActivity(intent);
            }
        });

    }
}