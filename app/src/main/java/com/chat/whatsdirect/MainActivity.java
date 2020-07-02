package com.chat.whatsdirect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {


    private EditText Mobile;
    private EditText Message;
    private Button etB;
    private CountryCodePicker cCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mobile=findViewById(R.id.etM);
        Message=findViewById(R.id.etT);
        etB =findViewById(R.id.etB);
        cCode = findViewById(R.id.cCode);
        etB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = Mobile.getText().toString().trim();
                String messages = Message.getText().toString().trim();
                String ccode = cCode.getSelectedCountryCode();
                String url = "https://wa.me/"+ ccode + phone + "?text=" + messages ;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}
