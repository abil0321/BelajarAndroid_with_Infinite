package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Superhero_Adapter(private val context: Context, private val superhero: List<Superhero_Model>, val listener: (Superhero_Model) -> Unit)
    : RecyclerView.Adapter<Superhero_Adapter.SuperheroViewHolder>(){
    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)
        fun bindView(superhero: Superhero_Model, listener: (Superhero_Model) -> Unit){
            imgSuperhero.setImageResource(superhero.imgSuperhero)
            namaSuperhero.text = superhero.namaSuperhero
            descSuperhero.text = superhero.descSuperhero
            itemView.setOnClickListener {
                listener(superhero)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size


}