package com.diegocastro.kotlinretrofitpokemon.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestEngine {

    companion object{
        fun getRestEngine(): Retrofit {
            val interceptor= HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            //interceptor es como un listener que escucha al servidor

            //construimos un interceptor
            val client =OkHttpClient.Builder().addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/pokemon/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            return retrofit

            //esto es como un metodo estatico puedo invocar sin instanciar
        }
    }
}