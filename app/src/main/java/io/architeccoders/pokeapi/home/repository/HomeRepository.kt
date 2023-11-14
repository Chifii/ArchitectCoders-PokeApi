package io.architeccoders.pokeapi.home.repository

import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.utils.Result

interface HomeRepository {
	suspend fun loadPokemonList(): Result<List<Pokemon>>
}
