package com.example.pinterfake_timkiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView tvBHCD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tvBHCD = (TextView) findViewById(R.id.tvBongHoaCoDon);
        tvBHCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,YTuongActivity.class);
                startActivity(intent);
            }
        });
    }


}