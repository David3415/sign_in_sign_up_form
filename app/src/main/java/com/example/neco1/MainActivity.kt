package com.example.neco1

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.constance.Constance
import com.example.neco1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)

        bindingClass.btEnter.setOnClickListener {

            val resultValue = bindingClass.tvInput.text.toString()

            when (resultValue) {
                Constance.INGENEER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText="Получите ${Constance.INGENEER_SUELDO}"
                    bindingClass.tvResult.text = tempText
                }

                Constance.DIRECTOR-> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText="Получите ${Constance.DVORNIK_SUELDO}"
                    bindingClass.tvResult.text =tempText
                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText="Получите ${Constance.DIRECTOR_SUELDO}"
                    bindingClass.tvResult.text =tempText
                }
                else ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого работника"

                }
            }
        }
        Log.d("MyLog", "OnCreate")

    }
}

