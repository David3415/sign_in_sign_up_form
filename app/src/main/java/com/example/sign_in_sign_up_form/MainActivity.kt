package com.example.sign_in_sign_up_form

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sign_in_sign_up_form.constance.Constance
import com.example.sign_in_sign_up_form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var pass: String = "empty"
    private var name1: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImgId: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Constance.REQUEST_CODE_SIGN_IN) {
            val l = data?.getStringExtra(Constance.LOGIN)
            val p = data?.getStringExtra(Constance.PASS)
            if (login == l && pass == p) {
                bindingClass.imAvatar.visibility=View.VISIBLE
                bindingClass.imAvatar.setImageResource(avatarImgId)
                val textInfo = "$name1 $name2 $name3"
                bindingClass.tvInfo.text = textInfo
                bindingClass.bHide.visibility = View.GONE
                bindingClass.bExit.text = "Выйти"
            } else {

                bindingClass.imAvatar.visibility=View.VISIBLE
                bindingClass.imAvatar.setImageResource(R.drawable.dula1)
                bindingClass.tvInfo.text = "Такого акк не сущ"
            }
        } else if (requestCode == Constance.REQUEST_CODE_SIGN_UP) {
            bindingClass.imAvatar.visibility=View.VISIBLE
            login = data?.getStringExtra(Constance.LOGIN)!!
            pass = data?.getStringExtra(Constance.PASS)!!
            name1 = data?.getStringExtra(Constance.NAME1)!!
            name2 = data?.getStringExtra(Constance.NAME2)!!
            name3 = data?.getStringExtra(Constance.NAME3)!!
            avatarImgId = data.getIntExtra(Constance.AVATAR_ID, 0)
            bindingClass.imAvatar.setImageResource(avatarImgId)
            val textInfo = "$name1 $name2 $name3"
            bindingClass.tvInfo.text = textInfo
            bindingClass.bHide.visibility = View.GONE
            bindingClass.bExit.text = "Выйти"
        }
    }

    fun onClickSignIn(view: View) {
        val intent = Intent(this, SigninupAct::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
    }

    fun onClickSignUp(view: View) {
        val intent = Intent(this, SigninupAct::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }

    fun onClicAvatar(view: View) {

    }
}

