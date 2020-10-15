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

        //validar os campos digitados
        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if( camposValidados ){
            //Convertendo string p/ numeros
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            //Fazer o calculo de menor preço
//            se (valor do alcool / valor da gasolina) >= 0.7 é melhor gasolina
//            senão é melhor alcool
            Double resultado = (valorAlcool / valorGasolina);
            if( resultado >= 0.7){
                textResultado.setText("Abasteça com Gasolina");
            }else {
                textResultado.setText("Abasteça com àlcool");
            }

        }else {
            textResultado.setText("Preencha os valors primeiro!");
        }

    }

    //public String validarCampos( String pAlcool, String pGasolina )
    public Boolean validarCampos( String pAlcool, String pGasolina ){
        Boolean camposValidados = true;
        //String campo = "preenchido";

        if ( pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
           // campo = "alcool";
        }else  if (pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
           // campo = "gasolina";
        }

        return camposValidados;
        //return campo;
    }
}