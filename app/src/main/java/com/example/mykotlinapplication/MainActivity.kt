package com.example.mykotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var buttonAdd:Button
    lateinit var buttonSub:Button
    lateinit var buttonMul:Button
    lateinit var buttonDiv:Button
    lateinit var etA:EditText
    lateinit var etB:EditText
    lateinit var resultTv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAdd = findViewById(R.id.btn_add)
        buttonSub=findViewById(R.id.btn_sub)
        buttonMul=findViewById(R.id.btn_mul)
        buttonDiv=findViewById(R.id.btn_div)

        etA=findViewById(R.id.et_a)
        etB=findViewById(R.id.et_b)
        resultTv=findViewById(R.id.result_tv)


        buttonAdd.setOnClickListener(this)
        buttonSub.setOnClickListener(this)
        buttonMul.setOnClickListener(this)
        buttonDiv.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        var a= etA.text.toString().toDouble()
        var b= etB.text.toString().toDouble()
        var result =0.0
        when(v?.id){
            R.id.btn_add->{
                result=  a+b
            }
            R.id.btn_sub->{
                result=  a-b
            }
            R.id.btn_mul->{
                result=  a*b
            }
            R.id.btn_div->{
                result=  a/b
            }

        }
        resultTv.text = "Result is $result"

    }
}