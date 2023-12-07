package io.architeccoders.pokeapi.home.repository

import io.architeccoders.pokeapi.home.model.PokemonResponse
import io.architeccoders.pokeapi.home.service.HomeApiService
import io.architeccoders.pokeapi.utils.Result
import io.architeccoders.pokeapi.utils.RetrofitService.getRetrofit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HomeRepositoryImpl : HomeRepository {
	override suspend fun loadPokemonList(): Result<PokemonResponse> {
		return withContext(Dispatchers.IO) {
			try {
				val apiService: HomeApiService = getRetrofit()
				val response = apiService.loadPokemonList()
				Result.Success(response)
			} catch (e: Exception) {
				Result.Error(e)
			}
		}
	}
}
