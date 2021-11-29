package com.example.gvedi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// ისეთის გაკეთება მინდოდა თავისი დარეგისტრირებული იმეილით და პაროლით შესვლა რომ შეძლებოდა მაგრამ დავალებაში
// რომარაა მეშინია ქულა არ დამაკლოთ ხდ

class MainActivity : AppCompatActivity() {

    private lateinit var register : Button
    private lateinit var alregister : Button
    private lateinit var email : EditText
    private lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        password = findViewById(R.id.password)
        email = findViewById(R.id.email)
        register = findViewById(R.id.reg)
        alregister = findViewById(R.id.alreadyReg)

        if(password.text.toString() != "" && email.text.toString() != ""){
            register.setOnClickListener {
                Toast.makeText(this, "თქვენ წარმატებით დარეგისტრირდით", Toast.LENGTH_SHORT).show()
            }
        }


        //es ubralod miweria
        register.setOnClickListener {
            val pirveli = email.text.toString()
            val meore = password.text.toString()
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("mail", pirveli)
            intent.putExtra("password", meore)
            startActivity(intent)
        }

        alregister.setOnClickListener{
            val intent1 = Intent(this, MainActivity2::class.java)

        }

    }

}