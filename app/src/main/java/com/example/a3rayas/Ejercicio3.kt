package com.example.a3rayas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Ejercicio3 : AppCompatActivity() {

    private var textooo = ""
    lateinit var texto : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        texto = findViewById<EditText>(R.id.editText)
    }



    fun guardarTexto(view: View) {

        textooo+=texto.text.toString()+","
    }

    fun nuevaActividad(view: View) {
        var intent=Intent(this,ResultadoEj3::class.java)
        intent.putExtra("texto",textooo)
        startActivity(intent)
    }
}