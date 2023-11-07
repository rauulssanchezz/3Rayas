package com.example.a3rayas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Ejercicio2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

    }


    fun boton(view: View) {

        val editText=findViewById<EditText>(R.id.edit1)
        val editNumber=findViewById<EditText>(R.id.edit2)

        val intent=Intent(this,ResultadoEj2::class.java)
        var texto=editText.text.toString()
        var numero=editNumber.text.toString()
        intent.putExtra("texto",texto)
        intent.putExtra("numero",numero)
        startActivity(intent)
    }
}