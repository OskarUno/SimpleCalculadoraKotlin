package com.awakelab.oskar.simplecalculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdd = findViewById<Button>(R.id.add)
        val btnSubt = findViewById<Button>(R.id.subtract)
        val btnDiv = findViewById<Button>(R.id.divide)
        val btnMult = findViewById<Button>(R.id.multiply)
        val num1 = findViewById<EditText>(R.id.n1)
        val num2 = findViewById<EditText>(R.id.n2)
        val resultant = findViewById<View>(R.id.total) as TextView

        //Suma
        btnAdd.setOnClickListener(View.OnClickListener {
            if (num1.text.toString().trim { it <= ' ' }.isEmpty() || num2.text.toString()
                    .trim { it <= ' ' }
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta rellenar los campos vacios.", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val num1In = num1.text.toString().toLong()
            val num2In = num2.text.toString().toLong()
            val result = num1In + num2In
            resultant.text = result.toString()
            Toast.makeText(baseContext, "Suma ${num1.text} + ${num2.text}", Toast.LENGTH_SHORT).show()
            //      Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
        })

        //Resta
        btnSubt.setOnClickListener(View.OnClickListener {
            if (num1.text.toString().trim { it <= ' ' }.isEmpty() || num2.text.toString()
                    .trim { it <= ' ' }
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta rellenar los campos vacios.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val num1In = num1.text.toString().toLong()
            val num2In = num2.text.toString().toLong()
            val result = num1In - num2In
            resultant.text = result.toString()
            Toast.makeText(baseContext, "Resta ${num1.text} - ${num2.text}", Toast.LENGTH_SHORT).show()
            // Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
        })

        //Division
        btnDiv.setOnClickListener(View.OnClickListener {
            if (num1.text.toString().trim { it <= ' ' }.isEmpty() || num2.text.toString()
                    .trim { it <= ' ' }
                    .isEmpty() || num1.text.toString() == "0" || num2.text.toString().toInt() == 0
            ) {
                Toast.makeText(baseContext, "Falta rellenar los campos vacios o en cero", Toast.LENGTH_SHORT).show()
                resultant.setText(R.string.error)
                return@OnClickListener
            }
            val num1In = num1.text.toString().toFloat()
            val num2In = num2.text.toString().toFloat()
            val result = num1In / num2In
            resultant.text = result.toString()
            Toast.makeText(baseContext, "Divide ${num1.text} / ${num2.text}", Toast.LENGTH_SHORT).show()
            //Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
        })

        //Multiplicacion
        btnMult.setOnClickListener(View.OnClickListener {
            if (num1.text.toString().trim { it <= ' ' }.isEmpty() || num2.text.toString()
                    .trim { it <= ' ' }
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta rellenar los campos vacios.", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val num1In  = num1.text.toString().toLong()
            val num2In  = num2.text.toString().toLong()
            val result = num1In * num2In
            resultant.text = result.toString()
            Toast.makeText(baseContext, "Multiplica ${num1.text} * ${num2.text}", Toast.LENGTH_SHORT).show()
            //Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
        })
    }
}