package com.example.callservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class banglalinkfirstactivity extends AppCompatActivity {
    Button stopbtn,cqnumbtn,cqdatabtn,cqbalbtn,emrbalbtn,otherbtn;
    String stop = "tel:" + "*121*5*1*2*1%23";
    String cqnum = "tel:" + "*511%23";
    String cqdata = "tel:" + "*5000*500%23";
    String cqbal = "tel:" + "*124%23";
    String emrbal = "tel:" +  "*874%23";
    String other = "tel:" + "*121%23";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglalinkfirstactivity);

        stopbtn = (Button) findViewById(R.id.stopbtn);
        cqnumbtn =(Button) findViewById(R.id.cqnumbtn);
        cqdatabtn = (Button) findViewById(R.id.cqdatabtn);
        cqbalbtn = (Button) findViewById(R.id.cqbalbtn);
        emrbalbtn = (Button) findViewById(R.id.emrbalbtn);
        otherbtn = (Button) findViewById(R.id.otherbtn);

        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(stop));
                startActivity(intent);
            }
        });
        cqnumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(cqnum));
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
        emrbalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(emrbal));
                startActivity(intent);
            }
        });
        otherbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(other));
                startActivity(intent);
            }
        });
    }
}
