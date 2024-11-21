/*
 *@author: Daiane Tararam
 *RA: 1110482322003
 */

package com.example.areadotrapezio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etBaseMenor;
    private EditText etBaseMaior;
    private EditText etAltura;
    private Button btnCalcular;
    private TextView tvArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.etBaseMenor), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etBaseMenor = findViewById(R.id.etBaseMenor);
        etBaseMenor.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        etBaseMaior = findViewById(R.id.etBaseMaior);
        etBaseMaior.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        etAltura = findViewById(R.id.etAltura);
        etAltura.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        tvArea = findViewById(R.id.tvArea);
        tvArea.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        btnCalcular.setOnClickListener(op -> calculo());
    }
    private void calculo(){
        double baseMenor = Double.parseDouble(etBaseMenor.getText().toString());
        double baseMaior = Double.parseDouble(etBaseMaior.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());
        double vArea = (baseMaior + baseMenor) * altura / 2;
        String resp = getString(R.string.tvArea) + " " + vArea;
        tvArea.setText(resp);

    }
}