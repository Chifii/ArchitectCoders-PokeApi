package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class Type(
	@SerializedName("slot")
	val slot: Int,
	@SerializedName("type")
	val type: GeneralDescription
)
