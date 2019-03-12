package com.example.callservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trainactivity extends AppCompatActivity {
    Button trainbtn;
    String ticket = "tel:" + "*131%23";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainactivity);
        trainbtn = (Button) findViewById(R.id.trainbtn);

        trainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(ticket));
                startActivity(intent);
            }
        });

    }
}
