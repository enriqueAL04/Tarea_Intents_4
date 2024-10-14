package com.example.tarea_intents_4;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;      // import para el botón
import android.widget.EditText;    // import para el campo de texto

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // encontrar el botón y el campo de texto por ID
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextText);

        // asignar un listener al botón
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // obtener el texto ingresado en el campo de texto
                String texto = editText.getText().toString();

                // crear un intent para ir a la segunda actividad
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                intent.putExtra("textoIngresado", texto);  // pasar el texto ingresado
                startActivity(intent);  // iniciar la segunda actividad
            }
        });
    }
}
