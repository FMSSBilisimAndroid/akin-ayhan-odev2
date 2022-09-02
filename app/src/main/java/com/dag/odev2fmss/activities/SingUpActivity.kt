package com.dag.odev2fmss.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.R
import com.dag.odev2fmss.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Odev2FMSS)
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_sing_up)

        binding.btnJoinNow.setOnClickListener() {
            validation()
        }
    }

    private fun validation() {
        validPassword()
        validUserName()
        validEmail()
    }

    private fun validEmail(): String? {
        val emailText = binding.enterEmail.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
            Toast.makeText(applicationContext, "E mail uygun değil !", Toast.LENGTH_SHORT).show()
        }
        return null
    }

    private fun validUserName(): String? {
        if (binding.createAcco.length() < 3) {
            Toast.makeText(applicationContext, "Kullanıcı adı uygun değil ! .", Toast.LENGTH_SHORT)
                .show()
        }
        return null
    }

    private fun validPassword(): String? {
        if (binding.createPass.length() < 8) {
            Toast.makeText(applicationContext, "Daha güçlü bir şifre giriniz .", Toast.LENGTH_SHORT)
                .show()
        }
        return null
    }


}