package io.architeccoders.pokeapi.home.service

import io.architeccoders.pokeapi.home.model.PokemonResponse
import retrofit2.http.GET

interface HomeApiService {
	@GET("pokemon")
	suspend fun loadPokemonList(): PokemonResponse
}
