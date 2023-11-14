package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class PastType(
	@SerializedName("generation")
	val generation: GeneralDescription,
	@SerializedName("types")
	val types: List<Type>
)
