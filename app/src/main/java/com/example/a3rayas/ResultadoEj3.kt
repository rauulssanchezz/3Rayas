package com.example.a3rayas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoEj3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ej3)
        var texto="las cadenas pasadas son:\n"+intent.getStringExtra("texto")
        var verTexto=findViewById<TextView>(R.id.text)
        verTexto.text=texto
    }
}