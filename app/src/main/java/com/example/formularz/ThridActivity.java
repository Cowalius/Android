package com.example.formularz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class ThridActivity extends Activity {

    private TextView tv;
    private String str;
    Button butt;



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        this.str=str + new Date()+ " "+ "onCreate \n";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        tv=findViewById(R.id.info);
        tv.setText(str);
        //przycisk powrotu
        butt=findViewById(R.id.powrot3);
        butt.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), secondActivity.class));
            }
        }));
    }

    @Override
    protected void onDestroy() {
        this.str = str+ new Date()+" "+"OnDestory\n";//musi byc przed super
        super.onDestroy();
        tv.setText(str);//wstawia tekst do tv

    }

    @Override
    protected void onPause() {
        this.str=str+ new Date()+" "+"onPause\n";
        super.onPause();
        tv.setText(str);

    }

    @Override
    protected void onResume() {
        this.str =str+ new Date()+" "+"OnResume\n";
        super.onResume();
        tv.setText(str);
    }

    @Override
    protected void onStop() {
        this.str = str+ new Date()+" "+"OnStop\n";
        super.onStop();
        tv.setText(str);
    }
}
