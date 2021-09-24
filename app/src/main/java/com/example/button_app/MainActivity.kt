package com.example.button_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var vi: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vi=findViewById(R.id.numvi)
        var plus =findViewById<Button>(R.id.plus)
        var minus = findViewById<Button>(R.id.minus)
        plus.setOnClickListener { vi.text=operation("+",vi.text.toString());rehandle(vi.text.toString()) }
        minus.setOnClickListener { vi.text=operation("-",vi.text.toString());rehandle(vi.text.toString())}

    }
    fun operation(op:String,current:String):String{
        var re=""
        if (op=="-"){
            re=(current.toInt()-1).toString()
            vi.y=vi.y+4
        }else{
            re=(current.toInt()+1).toString()
            vi.y=vi.y-4
        }
        return re
    }
    fun rehandle(se:String){
        if(se.toInt()>0){
            vi.setTextColor(Color.parseColor("#00FF00"))

        }else if(se.toInt()<0){
            vi.setTextColor(Color.parseColor("#FF0000"))

        }else{
            vi.setTextColor(Color.parseColor("#000000"))
        }

    }
}