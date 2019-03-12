package com.example.callservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class airtelfirstactivity extends AppCompatActivity {
    Button cqnumbtn,cqminbtn,cqdatabtn,cqbalbtn,cqsmsbtn;
    String cqnum = "tel:" + "*121*6*3%23";
    String cqmin = "tel:" + "*778*5%23";
    String cqdata = "tel:" + "*778*4%23";
    String cqbal = "tel:" + "*778%23";
    String cqsms = "tel:" + "*778*2%23";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtelfirstactivity);

        cqnumbtn =(Button) findViewById(R.id.cqnumbtn);
        cqminbtn = (Button) findViewById(R.id.cqminbtn);
        cqdatabtn = (Button) findViewById(R.id.cqdatabtn);
        cqbalbtn = (Button) findViewById(R.id.cqbalbtn);
        cqsmsbtn = (Button) findViewById(R.id.cqsmsbtn);


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
    }
}
