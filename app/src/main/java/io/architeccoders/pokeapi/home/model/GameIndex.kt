package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class GameIndex(
	@SerializedName("game_index")
	val gameIndex: Int,
	@SerializedName("version")
	val version: GeneralDescription
)
