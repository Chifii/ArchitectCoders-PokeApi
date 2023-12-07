package io.architeccoders.pokeapi.utils

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
	const val BASE_URL = "https://pokeapi.co/api/v2/"

	private val loggingInterceptor = HttpLoggingInterceptor().apply {
		level = HttpLoggingInterceptor.Level.BODY
	}

	val client = OkHttpClient.Builder()
		.addInterceptor(loggingInterceptor)
		.build()

	inline fun <reified T> getRetrofit(): T {
		val retrofit = Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.client(client)
			.build()

		return retrofit.create(T::class.java)
	}
}
