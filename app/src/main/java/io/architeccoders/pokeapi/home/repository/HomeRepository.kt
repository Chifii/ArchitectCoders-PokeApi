package io.architeccoders.pokeapi.home.repository

import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.home.model.PokemonResponse
import io.architeccoders.pokeapi.utils.Result

interface HomeRepository {
	suspend fun loadInitialPokemonList(offset: Int): Result<PokemonResponse>
	suspend fun loadPokemonData(id: Int): Result<Pokemon>
}
