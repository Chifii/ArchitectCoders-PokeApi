package io.architeccoders.pokeapi.home.service

import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.home.model.PokemonDataResponse
import io.architeccoders.pokeapi.home.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HomeApiService {
	@GET("pokemon")
	suspend fun loadPokemonList(
		@Query("offset") offset: Int = 0,
		@Query("limit") limit: Int = 25,
	): PokemonResponse

	@GET("pokemon/{id}")
	suspend fun loadPokemonData(
		@Path("id") id: Int
	): Pokemon
}
