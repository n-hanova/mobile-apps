package com.example.n_hanova.mylab_1_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button forward;
    private EditText name;
    private EditText lastName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (Button) findViewById(R.id.btnActTwo);
        name = (EditText) findViewById(R.id.name);
        lastName = (EditText) findViewById(R.id.lastname);
    }

    public void goNewView(View v){
        switch (v.getId()) {
            case R.id.btnActTwo:
                // Говорим между какими Activity будет происходить связь
                Intent intent = new Intent(this, NewActivity.class);

                // указываем первым параметром ключ, а второе значение
                // по ключу мы будем получать значение с Intent
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("lastname", lastName.getText().toString());

                // показываем новое Activity
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}