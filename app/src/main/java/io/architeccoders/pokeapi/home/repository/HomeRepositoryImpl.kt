package io.architeccoders.pokeapi.home.repository

import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.home.service.HomeApiService
import io.architeccoders.pokeapi.utils.RetrofitService.getRetrofit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import io.architeccoders.pokeapi.utils.Result

class HomeRepositoryImpl : HomeRepository {
	override suspend fun loadPokemonList(): Result<List<Pokemon>> {
		return withContext(Dispatchers.IO) {
			try {
				val apiService: HomeApiService = getRetrofit()
				val response = apiService.loadPokemonList()
				if (response.isSuccessful) {
					val pokemonList = response.body()?.results ?: emptyList()
					Result.Success(pokemonList)
				} else {
					Result.Error(Exception(response.message()))
				}
			} catch (e: Exception) {
				Result.Error(e)
			}
		}
	}
}
