package com.brab.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editAlcool, editGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool     = findViewById(R.id.editTextAlcool);
        editGasolina   = findViewById(R.id.editTextAlcool);
        textResultado  = findViewById(R.id.textResultado);

    }

    public void calcularPreço(View view){

        //recuperar valores
        String precoAlcool   = editAlcool.getText().toString();
        String precoGasolina = editGasolina.getText().toString();


    }
}