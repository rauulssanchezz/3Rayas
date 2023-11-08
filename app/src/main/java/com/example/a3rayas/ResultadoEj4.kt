package com.example.a3rayas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ResultadoEj4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ej4)
        var pais=intent.getStringExtra("pais")
        var habitantes=intent.getStringExtra("habitantes")
        var imagen=findViewById<ImageView>(R.id.imagen)
        var texto1=findViewById<TextView>(R.id.texto)
        var texto2=findViewById<TextView>(R.id.text2)
        texto1.text=pais
        texto2.text=habitantes
        if(pais.equals("españa",true)){
            imagen.setImageResource(R.drawable.espa_a)
        }else{
            imagen.setImageResource(R.drawable.francia)
        }
    }
}