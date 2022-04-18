package com.diegocastro.kotlinretrofitpokemon.retrofit

import com.google.gson.annotations.SerializedName

data class Pokemon (

    //creamos el modelo dataclass
    @SerializedName("base_experience")
    var base_experience:Int,
    @SerializedName("id")
    var id : Int,
    @SerializedName("name")
    var name : String,
    @SerializedName("sprites")
    var sprites: Sprites
)

//los objetos que están en la api se transforman en data class en nuestro modelo

data class Sprites (
    @SerializedName("back_default")
    var back_default: String,
    @SerializedName("back_female")
    var back_female:String,
    @SerializedName("back_shiny")
    var back_shiny:String,
    @SerializedName("back_shiny_female")
    var back_shiny_female:String,
    @SerializedName("front_default")
    var front_default:String,
    @SerializedName("front_female")
    var front_female: String,
    @SerializedName("front_shiny")
    var front_shiny:String,
    @SerializedName("front_shiny_female")
    var front_shiny_female:String,
          )

