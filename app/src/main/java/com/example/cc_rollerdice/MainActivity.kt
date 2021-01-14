package com.example.cc_rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.button)
        imageView=findViewById(R.id.imageView)

        button.text="Roll"
        button.setOnClickListener(){
            val number:Int= java.util.Random().nextInt(6)+1
            setValue(number)
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }

    }

    private fun setValue(number: Int) {

        val image=when (number){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else -> R.drawable.dice_1
        };
        imageView.setImageResource(image)
    }

}