package com.example.a3rayas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)
    }

    fun francia(view: View) {
        var pais="Francia"
        var habitantes="60000000"

        val intent=Intent(this,ResultadoEj4::class.java)
        intent.putExtra("pais",pais)
        intent.putExtra("habitantes",habitantes)
        startActivity(intent)
    }
    fun españa(view: View) {
        var pais="España"
        var habitantes="50000000"

        val intent=Intent(this,ResultadoEj4::class.java)
        intent.putExtra("pais",pais)
        intent.putExtra("habitantes",habitantes)
        startActivity(intent)
    }
}