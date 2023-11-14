package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class GeneralDescription(
	@SerializedName("name")
	val name: String,
	@SerializedName("url")
	val url: String
)
