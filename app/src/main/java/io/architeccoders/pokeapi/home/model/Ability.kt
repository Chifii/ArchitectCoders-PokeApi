package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class Ability(
	@SerializedName("ability")
	val ability: GeneralDescription,
	@SerializedName("is_hidden")
	val isHidden: Boolean,
	@SerializedName("slot")
	val slot: Int
)

