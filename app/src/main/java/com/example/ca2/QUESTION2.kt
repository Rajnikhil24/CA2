package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class QUESTION2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
        val firstname = findViewById<EditText>(R.id.first_name)
        val lastname = findViewById<EditText>(R.id.last_name)
        val radio = findViewById<RadioGroup>(R.id.radiogrp1)
        val male = findViewById<RadioButton>(R.id.male)
        val female = findViewById<RadioButton>(R.id.female)
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        val btn = findViewById<Button>(R.id.btn)
        val pass = findViewById<EditText>(R.id.yourpass)
        val email = findViewById<EditText>(R.id.youremail)

        radio.setOnCheckedChangeListener{
                _, selected_id ->
            when(findViewById<RadioButton>(selected_id)){
                male->
                    Toast.makeText(this , "Male" , Toast.LENGTH_SHORT).show()
                female->
                    Toast.makeText(this , "Female" , Toast.LENGTH_SHORT).show()
            }
        }

        btn.setOnClickListener{
            if (firstname.text.toString().isEmpty() || lastname.text.toString().isEmpty() || email.text.toString().isEmpty() || pass.text.toString().isEmpty() || !checkBox.isChecked)
                Toast.makeText(this , "Please fill the form entirely " , Toast.LENGTH_SHORT).show()

            else{
                Toast.makeText(this , "Thank You ${firstname.text} ${lastname.text} for your response " , Toast.LENGTH_SHORT).show()
                firstname.setText("")
                lastname.setText("")
                email.setText("")
                pass.setText("")
                radio.clearCheck()
                checkBox.toggle()
            }





        }

    }

    fun checkboxclicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            when (view.id) {
                R.id.checkbox -> {
                    if (checked) {
                        Toast.makeText(this , "You accepted the terms and condition" , Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }
    }

}
