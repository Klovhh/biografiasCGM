package com.example.biografiascgm;

import static com.example.biografiascgm.R.id.scroll_view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView subtitulo;
    private TextView texto;
    private ImageView imagen;
    private Button btn;
    private Button btn2;
    private ScrollView scrollView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subtitulo = findViewById(R.id.subtituloArticulo);
        texto = findViewById(R.id.textoArticulo);
        imagen = findViewById(R.id.imagenBiografia);
        scrollView = findViewById(scroll_view);

        btn = findViewById(R.id.siguienteBTN);
        btn.setOnClickListener(this::cambiarASig);
        btn2 = findViewById(R.id.anteriorBTN);
        btn2.setOnClickListener(this::cambiarAAnt);







    }

    public void cambiarASig(View view) {
        scrollView.smoothScrollTo(0, 0);
        subtitulo.setText(R.string.subtitulo2TXT);
        texto.setText(R.string.texto2TXT);
        imagen.setImageResource(R.drawable.hidalgo);
        scrollView.smoothScrollTo(0, 0);

    }

    public void cambiarAAnt(View view) {
        scrollView.smoothScrollTo(0, 0);
        subtitulo.setText(R.string.subtituloTXT);
        texto.setText(R.string.textoTXT);
        imagen.setImageResource(R.drawable.benito);
        scrollView.smoothScrollTo(0, 0);

    }

}