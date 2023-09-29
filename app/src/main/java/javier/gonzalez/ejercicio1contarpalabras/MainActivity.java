package javier.gonzalez.ejercicio1contarpalabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFrase;
    private Button btnLetrasMain;
    private Button btnPalabrasMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
        String frase = editTextFrase.getText().toString();


        btnPalabrasMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if(editTextFrase.length()>0){
                    int contarPalabras = frase.split(" ").length;
                    String mensaje= " El numero de palabras es "+ contarPalabras;
                    crearNuevaActividad(mensaje);
                }else{
                    Toast.makeText(MainActivity.this, " Escribe algoo",Toast.LENGTH_SHORT).show();
                }


            }
        });
//Podriamos hacer las funciones onClick con una funcion comun que hiciera una accion o otra segun el
// identificador del boton que ha sido pulsado para ahorrar trabajo
      btnLetrasMain.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if(editTextFrase.length()>0){
                  int contarPalabras = frase.trim().length();
                  String mensaje= " El numero de letras es "+ contarPalabras;
                  crearNuevaActividad(mensaje);
              }else{
                  Toast.makeText(MainActivity.this, " Escribe algoo",Toast.LENGTH_SHORT).show();
              }



          }
      });
    }
    private void crearNuevaActividad(String mensaje){
        Intent intent = new Intent(MainActivity.this,
                SecondaryActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("MSG", mensaje);
        intent.putExtras(bundle);
        intent.putExtras(bundle);

    }


    private void inicializar() {
editTextFrase =findViewById(R.id.editTextFrase);
btnLetrasMain=findViewById(R.id.btnLetrasMain);
btnPalabrasMain=findViewById(R.id.btnPalabrasMain);
    }
}