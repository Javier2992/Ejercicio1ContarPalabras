package javier.gonzalez.ejercicio1contarpalabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFrase;
    private Button btnLetras;
    private Button btnPalabras;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();

        String frase = editTextFrase.getText().toString();

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextFrase.setText(frase);
                Intent intent = new Intent(MainActivity.this,
                        SecondaryActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(frase, frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

      btnLetras.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              editTextFrase.setText(frase);Intent intent = new Intent(MainActivity.this,
                      SecondaryActivity.class);
              Intent inten = new Intent(MainActivity.this,
                      SecondaryActivity.class);
              Bundle bundle = new Bundle();
              bundle.putString(frase, frase);
              intent.putExtras(bundle);
              startActivity(inten);

          }
      });
    }

    private void inicializar() {
editTextFrase.findViewById(R.id.editTextFrase);
btnLetras.findViewById(R.id.btnLetras);
btnPalabras.findViewById(R.id.btnPalabras);
    }
}