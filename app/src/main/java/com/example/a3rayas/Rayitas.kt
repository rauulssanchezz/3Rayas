package com.example.a3rayas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Rayitas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rayitas)
    }

    fun pulsado(view: View) {
        when(view.id){
            R.id.boton1->{
                var btn1 = findViewById<Button>(R.id.boton1)
                btn1.setBackgroundResource(R.drawable.coca)
            }
        }
    }
}