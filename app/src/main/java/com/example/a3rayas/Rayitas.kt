package com.example.a3rayas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Rayitas : AppCompatActivity() {
    var tableroid= mutableListOf(1,2,3,4,5,6,7,8,9)
    var tablero= mutableListOf(0,0,0,0,0,0,0,0,0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rayitas)


    }

    fun pulsado(view: View) {
        when(view.id){
            R.id.boton1->{
                if (tablero[0]==0) {
                    var btn1 = findViewById<ImageView>(R.id.boton1)
                    btn1.setImageResource(R.drawable.coca)
                    tablero[0] = 1
                    checkTablero()
                }

            }
            R.id.boton2->{
                if (tablero[1]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton2)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[1] = 1
                    checkTablero()
                }
            }
            R.id.boton3->{
                if (tablero[2]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton3)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[2] = 1
                    checkTablero()
                }
            }
            R.id.boton4->{
                if (tablero[3]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton4)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[3]= 1
                    checkTablero()
                }
            }
            R.id.boton5->{
                if (tablero[4]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton5)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[4] = 1
                    checkTablero()
                }
            }
            R.id.boton6->{
                if (tablero[5]==0) {
                var btn2 = findViewById<ImageView>(R.id.boton6)
                btn2.setImageResource(R.drawable.coca)
                tablero[5] = 1
                    checkTablero()
            }
            }
            R.id.boton7->{
                if(tablero[6]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton7)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[6] = 1
                    checkTablero()
                }
            }
            R.id.boton8->{
                if(tablero[7]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton8)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[7] = 1
                    checkTablero()
                }
            }
            R.id.boton9->{
                if (tablero[8]==0) {
                    var btn2 = findViewById<ImageView>(R.id.boton9)
                    btn2.setImageResource(R.drawable.coca)
                    tablero[8] = 1
                    checkTablero()
                }
            }
        }
    }

    fun checkTablero(){
        var res =0
        for (i in tablero.indices){

                if(tablero[i]==0){
                    tablero[i]=2
                    res=tableroid[i]
                    // Suponiendo que tienes el nombre del recurso en una variable llamada resourceName
                    val resourceName = "boton"+res

                    // Obteniendo el ID del recurso a partir de su nombre
                    val resourceId = resources.getIdentifier(resourceName, "id", packageName)
                    var img=findViewById<ImageView>(resourceId)
                    img.setImageResource(R.drawable.aspiradora)
                    break
                }

        }

    }



}