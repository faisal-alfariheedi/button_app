package com.example.button_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vi =findViewById<TextView>(R.id.numvi)
        var plus =findViewById<Button>(R.id.plus)
        var minus = findViewById<Button>(R.id.minus)
        plus.setOnClickListener { vi.text=operation("+",vi.text.toString()) }
        minus.setOnClickListener { vi.text=operation("-",vi.text.toString())}

    }
    fun operation(op:String,current:String):String{
        var re=""
        if (op=="-"){
            re=(current.toInt()-1).toString()
        }else{
            re=(current.toInt()+1).toString()
        }
        return re
    }
}