package com.example.vangtichai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.btn0
import kotlinx.android.synthetic.main.activity_main.btn1
import kotlinx.android.synthetic.main.activity_main.btn2
import kotlinx.android.synthetic.main.activity_main.btn3
import kotlinx.android.synthetic.main.activity_main.btn4
import kotlinx.android.synthetic.main.activity_main.btn5
import kotlinx.android.synthetic.main.activity_main.btn6
import kotlinx.android.synthetic.main.activity_main.btn7
import kotlinx.android.synthetic.main.activity_main.btn8
import kotlinx.android.synthetic.main.activity_main.btn9
import kotlinx.android.synthetic.main.activity_main.btnclear
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_main.textView1
import kotlinx.android.synthetic.main.activity_main.textView10
import kotlinx.android.synthetic.main.activity_main.textView100
import kotlinx.android.synthetic.main.activity_main.textView2
import kotlinx.android.synthetic.main.activity_main.textView20
import kotlinx.android.synthetic.main.activity_main.textView200
import kotlinx.android.synthetic.main.activity_main.textView5
import kotlinx.android.synthetic.main.activity_main.textView50
import kotlinx.android.synthetic.main.activity_main.textView500

class MainActivity : AppCompatActivity() {

    var input = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnclear.setOnClickListener(){
            textView.setText("Taka: ")
            input = ""
            setTaka("0")
        }
        btn0.setOnClickListener(){
            input += "0"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn1.setOnClickListener(){
            input += "1"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn2.setOnClickListener(){
            input += "2"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn3.setOnClickListener(){
            input += "3"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn4.setOnClickListener(){
            input += "4"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn5.setOnClickListener(){
            input += "5"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn6.setOnClickListener(){
            input += "6"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn7.setOnClickListener(){
            input += "7"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn8.setOnClickListener(){
            input += "8"
            textView.setText("Taka: "+input)
            setTaka(input)
        }
        btn9.setOnClickListener(){
            input += "9"
            textView.setText("Taka: "+input)
            setTaka(input)
        }





    }


    fun setTaka(input: String){

        var taka = 0
        if(input != ""){
            taka = input.toInt()
        }
        if(taka == null){
            taka = 0
        }
        var taka_500 = taka / 500
        taka = taka % 500
        var taka_200 = taka / 200
        taka = taka % 200
        var taka_100 = taka / 100
        taka = taka % 100
        var taka_50 = taka / 50
        taka = taka % 50
        var taka_20 = taka / 20
        taka = taka % 20
        var taka_10 = taka / 10
        taka = taka % 10
        var taka_5 = taka / 5
        taka = taka % 5
        var taka_2 = taka / 2
        taka = taka % 2
        var taka_1 = taka
        textView1.setText("1: "+taka_1)
        textView2.setText("2: "+taka_2)
        textView5.setText("5: "+taka_5)
        textView10.setText("10: "+taka_10)
        textView20.setText("20: "+taka_20)
        textView50.setText("50: "+taka_50)
        textView100.setText("100: "+taka_100)
        textView200.setText("200: "+taka_200)
        textView500.setText("500: "+taka_500)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("input", input)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        input = savedInstanceState.getString("input","")
        setTaka(input)
        textView.setText("Taka: "+input)
    }




}