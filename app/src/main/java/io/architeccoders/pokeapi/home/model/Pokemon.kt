package io.architeccoders.pokeapi.home.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
	@SerializedName("abilities")
	val abilities: List<Ability>,
	@SerializedName("base_experience")
	val baseExperience: Int,
	@SerializedName("forms")
	val forms: List<GeneralDescription>,
	@SerializedName("game_indices")
	val gameIndices: List<GameIndex>,
	@SerializedName("height")
	val height: Int,
	@SerializedName("id")
	val id: Int,
	@SerializedName("is_default")
	val isDefault: Boolean,
	@SerializedName("location_area_encounters")
	val locationAreaEncounters: String,
	@SerializedName("moves")
	val moves: List<Move>,
	@SerializedName("name")
	val name: String,
	@SerializedName("order")
	val order: Int,
	@SerializedName("past_types")
	val pastTypes: List<PastType>,
	@SerializedName("species")
	val species: GeneralDescription,
	@SerializedName("sprites")
	val sprites: Sprites,
	@SerializedName("stats")
	val stats: List<Stat>,
	@SerializedName("types")
	val types: List<Type>,
	@SerializedName("weight")
	val weight: Int
)