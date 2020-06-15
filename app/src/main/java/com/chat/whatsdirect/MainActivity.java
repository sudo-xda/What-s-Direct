package com.chat.whatsdirect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Mobile;
    private Button etB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mobile=findViewById(R.id.etM);
        etB =findViewById(R.id.etB);
        etB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = Mobile.getText().toString().trim();
                String url = "https://wa.me/"+91 + phone ;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}
