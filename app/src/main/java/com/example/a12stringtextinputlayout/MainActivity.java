package com.example.a12stringtextinputlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout tilNombre, tilContrasena;
    Button btnCancelar, btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilNombre = findViewById(R.id.tilNombre);
        tilContrasena = findViewById(R.id.tilContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnCancelar = findViewById(R.id.btnCancelar);

        tilNombre.setErrorEnabled(true);
        tilContrasena.setErrorEnabled(true);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = tilNombre.getEditText().getText().toString();
                String contrasena = tilContrasena.getEditText().getText().toString();

                if (!nombre.equals(""))
                    tilNombre.setError(null);
                else
                    tilNombre.setError(getString(R.string.ErrorCampoVacio));

                if (!contrasena.equals(""))
                    tilContrasena.setError(null);
                else
                    tilContrasena.setError(getString(R.string.ErrorCampoVacio));
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tilNombre.getEditText().setText("");
                tilContrasena.getEditText().setText("");
            }
        });
    }
}
