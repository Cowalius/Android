package com.example.formularz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView testView;
    private Button next;
    private CheckBox zasady;
    private EditText name, surname, country;
    private RadioButton butr;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testView = findViewById(R.id.name);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        country = findViewById(R.id.country);
        zasady = findViewById(R.id.over18);
        group = findViewById(R.id.radioGroup);
        next = findViewById(R.id.next_but1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nname=name.getText().toString().trim();
                String ccountry=country.getText().toString().trim();
                String ssurname=surname.getText().toString().trim();
                String zzasady=zasady.isChecked() == true ? "yes" : "no";
                butr =findViewById(group.getCheckedRadioButtonId());
                Bundle bundle=new Bundle();
                bundle.putString("name", nname);
                bundle.putString("surname", ssurname);
                bundle.putString("Country",ccountry);
                bundle.putString("Privacy_Policy",zzasady);
                bundle.putString("Gender", butr.getText().toString());
                Intent intento=new Intent(MainActivity.this,secondActivity.class);
                intento.putExtras(bundle);
                startActivity(intento);




            }
        });
    }
    /*//zeby przyciskiem next activity wywolac
    public void Next(View view){


        Intent intent = new Intent(this, secondActivity.class);
        //intent to klasa dzieki ktorej sie zmienia klasy
        startActivity(intent);

    }*/
}