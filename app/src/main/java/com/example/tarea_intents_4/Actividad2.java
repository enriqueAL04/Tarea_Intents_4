package com.example.tarea_intents_4;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;  // importar para mostrar el texto

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_actividad2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // obtener el intent y el texto enviado
        Intent intent = getIntent();
        String textoRecibido = intent.getStringExtra("textoIngresado");  // recoger el texto

        // mostrar el texto en el textView
        TextView textView = findViewById(R.id.textView2do);
        textView.setText(textoRecibido);  // mostrar el texto recibido
    }
}
