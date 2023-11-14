package io.architeccoders.pokeapi.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
	const val BASE_URL = "https://pokeapi.co/api/v2/"

	inline fun <reified T> getRetrofit(): T {
		val retrofit = Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.build()

		return retrofit.create(T::class.java)
	}
}
