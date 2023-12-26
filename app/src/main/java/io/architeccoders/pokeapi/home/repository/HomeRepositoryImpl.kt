package io.architeccoders.pokeapi.home.repository

import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.home.model.PokemonDataResponse
import io.architeccoders.pokeapi.home.model.PokemonResponse
import io.architeccoders.pokeapi.home.service.HomeApiService
import io.architeccoders.pokeapi.utils.Result
import io.architeccoders.pokeapi.utils.RetrofitService.getRetrofit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HomeRepositoryImpl : HomeRepository {
	override suspend fun loadInitialPokemonList(
		offset: Int
	): Result<PokemonResponse> {
		return withContext(Dispatchers.IO) {
			try {
				val apiService: HomeApiService = getRetrofit()
				val response = apiService.loadPokemonList(offset)
				Result.Success(response)
			} catch (e: Exception) {
				Result.Error(e)
			}
		}
	}

	override suspend fun loadPokemonData(id: Int): Result<Pokemon> {
		return withContext(Dispatchers.IO) {
			try {
				val apiService: HomeApiService = getRetrofit()
				val response = apiService.loadPokemonData(id)
				Result.Success(response)
			} catch (e: Exception) {
				Result.Error(e)
			}
		}
	}
}
