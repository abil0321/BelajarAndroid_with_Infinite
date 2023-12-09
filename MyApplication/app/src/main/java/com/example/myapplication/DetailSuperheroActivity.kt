package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        val superhero = intent.getParcelableExtra<Superhero_Model>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val namaSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgSuperhero.setImageResource(superhero?.imgSuperhero!!)
        namaSuperhero.text = superhero.namaSuperhero
        descSuperhero.text = superhero.descSuperhero

    }
}