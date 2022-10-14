package com.example.formularz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends Activity {



    private Button goBackButton;
    private Button goNextButton;
    private TextView name2;
    private TextView surname2;
    private TextView country2;
    private TextView sex2;
    private TextView over18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        name2 = findViewById(R.id.nameodp);
        surname2 = findViewById(R.id.lastnameodp);
        country2 = findViewById(R.id.countryodp);

        sex2 = findViewById(R.id.sexodp);
        over18 = findViewById(R.id.zasadyodp);
        goBackButton = findViewById(R.id.previous);
        goNextButton = findViewById(R.id.next);

        Intent intent = getIntent();
        name2.setText(intent.getStringExtra("name"));
        surname2.setText(intent.getStringExtra("surname"));
        country2.setText(intent.getStringExtra("Country"));
        sex2.setText(intent.getStringExtra("Gender"));
        over18.setText(intent.getStringExtra("Privacy_Policy"));


        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });

        goNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), ThridActivity.class));
            }
        });
    }}/*
//polaczenie z second activity layout
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }
//przyciski z drugiego 2

    public void Next(View view){
        String button_text;
        button_text=((Button) view).getText().toString();
        if(button_text.equals("Next")){

            Intent intent = new Intent(this, ThridActivity.class);
            //intent to klasa dzieki ktorej sie zmienia klasy
            startActivity(intent);
        }else if(button_text.equals("Previous")){
            Intent intent2= new Intent(this, MainActivity.class);
            startActivity(intent2);
        }


    }
}
*/