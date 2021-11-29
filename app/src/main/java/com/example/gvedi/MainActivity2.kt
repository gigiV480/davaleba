package com.example.gvedi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton


class MainActivity2 : AppCompatActivity() {

    private lateinit var confirm : Button
    private lateinit var email : EditText
    private lateinit var password : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        confirm.findViewById<MaterialButton>(R.id.confirm_button)
        email = findViewById(R.id.mail)
        password = findViewById(R.id.paroli)



        confirm.setOnClickListener{
            if(email.text.toString() == "kotlini@gmail.com" && password.text.toString() == "kotlini"){
                Toast.makeText(this, "თქვევნ წარმატებით გაიარეთ რეგისტრაცია", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "თქვენ წარუმატებლად გაიარეთ რეგისტრაცია", Toast.LENGTH_SHORT).show()
            }
        }

    }
}