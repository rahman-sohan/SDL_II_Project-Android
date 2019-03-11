package com.example.callservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teletalkfirstactivity extends AppCompatActivity {
    Button cqnumbtn,cqminbtn,cqdatabtn,cqbalbtn,cqsmsbtn,cqmmsbtn;
    String cqnum = "tel:" +  "*551%23";
    String cqmin = "tel:" + "*152%23";
    String cqdata = "tel:" + "*152%23";
    String cqbal = "tel:" + "*152%23";
    String cqsms = "tel:" + "*152%23";
    String cqmms = "tel:" + "*152%23";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teletalkfirstactivity);

        cqnumbtn =(Button) findViewById(R.id.cqnumbtn);
        cqminbtn = (Button) findViewById(R.id.cqminbtn);
        cqdatabtn = (Button) findViewById(R.id.cqdatabtn);
        cqbalbtn = (Button) findViewById(R.id.cqbalbtn);
        cqsmsbtn = (Button) findViewById(R.id.cqsmsbtn);
        cqmmsbtn = (Button) findViewById(R.id.cqmmsbtn);


        cqnumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqnum));
                startActivity(intent);
            }
        });
        cqminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqmin));
                startActivity(intent);
            }
        });
        cqdatabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqdata));
                startActivity(intent);
            }
        });
        cqbalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqbal));
                startActivity(intent);
            }
        });
        cqsmsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqsms));
                startActivity(intent);
            }
        });
        cqmmsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqmms));
                startActivity(intent);
            }
        });
    }
}
