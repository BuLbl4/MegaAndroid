package com.itis.megahw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bt_button)
        val resultTextView = findViewById<TextView>(R.id.tv_result)
        val nameText = findViewById<EditText>(R.id.et_name)
        val heightText = findViewById<EditText>(R.id.et_height)
        val weightText = findViewById<EditText>(R.id.et_weight)
        val ageText = findViewById<EditText>(R.id.et_age)

        button.setOnClickListener{

            val name = nameText.text.toString()
            val heightString = heightText.text.toString()
            val weightString = weightText.text.toString()
            val ageString = ageText.text.toString()
            val isValid = ValidateFields(name, heightString, weightString, ageString)

            if (isValid){
                val height = heightString.toInt()
                val weight = weightString.toDouble()
                val age = ageString.toInt()

                val result = calculateResult(name, height, weight, age)
                resultTextView.text = result.toString()
            } else{
                resultTextView.text = "Invalid data"
            }
        }

    }

    private fun ValidateFields(name: String, height: String, weight: String, age: String): Boolean {

        if (name.isEmpty() || height.isEmpty() || weight.isEmpty() || age.isEmpty()) {
            return false
        }

        val heightValue = height.toIntOrNull()
        val weightValue = weight.toDoubleOrNull()
        val ageValue = age.toIntOrNull()

        if (name.length > 50){
            return false
        }

        if (heightValue == null || heightValue <= 0 || heightValue >= 250) {
            return false
        }

        if (weightValue == null || weightValue <= 0 || weightValue >= 250) {
            return false
        }

        if (ageValue == null || ageValue <= 0 || ageValue >= 150) {
            return false
        }

        return true
    }
    private fun calculateResult(name: String, height: Int, weight: Double, age: Int): Double {
        return (height + weight) / (age + name.length)
    }

}

