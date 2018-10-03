package com.example.cmmccoy.lab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textButton.setOnClickListener{
            textView.text = "New Text!"
        }

        toastButton.setOnClickListener{
            val myToast = Toast.makeText(this, "Some festive message", Toast.LENGTH_SHORT)
            myToast.show()
        }

        longClickButton.setOnLongClickListener{
            Toast.makeText(this, "Long click", Toast.LENGTH_SHORT).show()
            true
        }

        visibilityButton.setOnClickListener{

            if (textView.visibility == View.INVISIBLE)
            {
                textView.visibility = View.VISIBLE
            }
            else
            {
                textView.visibility = View.INVISIBLE
            }

        }
    }
}
