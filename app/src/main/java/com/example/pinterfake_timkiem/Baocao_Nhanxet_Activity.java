package com.example.pinterfake_timkiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Baocao_Nhanxet_Activity extends AppCompatActivity {
    private TextView txtBaocao;
    private Button btnDong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baocao_nhanxet);

        txtBaocao = (TextView) findViewById(R.id.txtbaocao_cmt2);
        btnDong = (Button) findViewById(R.id.btnDong_cmt2);

        txtBaocao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Baocao_Nhanxet_Activity.this,Baocao_Nhanxet2_Activity.class);
                startActivity(intent);
            }
        });
        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Baocao_Nhanxet_Activity.this,cmt_Activity.class);
                startActivity(intent);
            }
        });
    }
}