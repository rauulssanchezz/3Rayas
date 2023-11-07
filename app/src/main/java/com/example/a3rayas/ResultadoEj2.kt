package com.example.a3rayas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoEj2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ej2)
        var texto=intent.getStringExtra("texto")
        var numero= intent.getStringExtra("numero")?.toInt()
        var text1=findViewById<TextView>(R.id.text1)
        var text2=findViewById<TextView>(R.id.text2)
        text1.text="Hemos recibido el texto: $texto"
        text2.text="Hemos recibido el numero: $numero"
    }
}