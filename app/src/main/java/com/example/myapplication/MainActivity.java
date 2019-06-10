package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_EMAIL,"uniaodu@gmail.com");
                sendEmail.putExtra(Intent.EXTRA_TEXT,"Olá quero um café");
                sendEmail.putExtra(Intent.EXTRA_SUBJECT,"Café");

                if(sendEmail.resolveActivity(getPackageManager())   != null){
                    startActivity(sendEmail);
                    //alteração
                }


            }
        });

    }
}
