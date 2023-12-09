package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero_Model>(
            Superhero_Model(
                R.drawable.hekker,
                "Hekker",
                "penghekker aplikasi"
            ),
            Superhero_Model(
                R.drawable.hawkeye_01ab,
                "Hawkeye",
                "Tukang panah tak kena-kena"
            ),
            Superhero_Model(
                R.drawable.jatoh,
                "Orang Jatoh",
                "Orang jatoh gajelas dari mana"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Superhero_Adapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}