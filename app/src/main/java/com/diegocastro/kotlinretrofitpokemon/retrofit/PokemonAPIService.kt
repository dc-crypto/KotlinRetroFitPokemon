package com.diegocastro.kotlinretrofitpokemon.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPIService {

    //creamos un metodo

    @GET("{nombre}")
    fun obtenerPokemon(@Path("nombre") nombre:String): Call<Pokemon>

    }


