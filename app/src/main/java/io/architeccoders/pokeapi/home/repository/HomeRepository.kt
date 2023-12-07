package io.architeccoders.pokeapi.home.repository

import io.architeccoders.pokeapi.home.model.PokemonResponse
import io.architeccoders.pokeapi.utils.Result

interface HomeRepository {
	suspend fun loadPokemonList(): Result<PokemonResponse>
}
