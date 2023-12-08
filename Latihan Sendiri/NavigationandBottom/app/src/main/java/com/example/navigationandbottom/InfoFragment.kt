package com.example.navigationandbottom

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InfoFragment : Fragment() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

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

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Superhero_Adapter(requireActivity(), superherolist){
            val intent = Intent (requireActivity(), DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        return view
    }

}