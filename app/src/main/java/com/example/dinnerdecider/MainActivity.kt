package com.example.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private val foodList  = arrayListOf("Adobo", "Hotdog", "Pritong Itlog", "Noodles", "Pancit Canton", "Sardinas")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            if (newFood != ""){
                foodList.add(newFood)
                addFoodTxt.text.clear()
            }

        }

    }
}