package com.example.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero_Model(
    val imgSuperhero: Int,
    val namaSuperhero: String,
    val descSuperhero:String
) : Parcelable
