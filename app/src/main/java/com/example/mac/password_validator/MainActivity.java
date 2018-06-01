package com.example.mac.password_validator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import javax.xml.validation.Validator;
import asdf.Validator.*;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    private CharSequence pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);
        textView=(TextView)findViewById(R.id.textView);
        textView.setTextSize(20);
        pass=editText.getText();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asdf.Validator v=new asdf.Validator(pass);
                if(v.strong())
                {
                    textView.setText("Strong");
                    textView.setTextColor(Color.rgb(0,100,100));
                }
                else {
                    textView.setText("Not Strong");
                    textView.setTextColor(Color.rgb(200,0,0));
                }

            }
        });


    }
}
