package io.architeccoders.pokeapi.home.service

import retrofit2.http.GET

interface HomeApiService {
	@GET("pokemon")
	suspend fun loadPokemonList(): PokemonListResponse
}
