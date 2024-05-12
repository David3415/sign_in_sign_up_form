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
            bindingClass.imPhoto.visibility = View.VISIBLE
            when (resultValue) {
                Constance.INGENEER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Constance.INGENEER_SUELDO}"

                    if (bindingClass.edPassword.text.toString() == Constance.INGENEER_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.andrey)
                    } else {
                        "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.ku)
                    }
                }

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Constance.DVORNIK_SUELDO}"

                        if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {
                            bindingClass.tvResult.text =tempText
                            bindingClass.imPhoto.setImageResource(R.drawable.egor)
                        } else {
                            bindingClass.imPhoto.setImageResource(R.drawable.ku)
                            "Неверный пароль"
                        }
                    bindingClass.tvResult.text = tempText
                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Constance.DVORNIK_SUELDO}"

                        if (bindingClass.edPassword.text.toString() == Constance.DVORNIK_PASSWORD) {
                            bindingClass.tvResult.text =tempText
                            bindingClass.imPhoto.setImageResource(R.drawable.sergey)
                        } else {
                            bindingClass.imPhoto.setImageResource(R.drawable.ku)
                            "Неверный пароль"
                        }
                    bindingClass.tvResult.text = tempText
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого работника"

                }
            }
        }
        Log.d("MyLog", "OnCreate")

    }
}

