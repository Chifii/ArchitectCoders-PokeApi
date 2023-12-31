package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
	@SerializedName("count")
	val count: Int?,
	@SerializedName("next")
	val next: String?,
	@SerializedName("previous")
	val previous: Any?,
	@SerializedName("results")
	val results: List<PokemonBase>
)
