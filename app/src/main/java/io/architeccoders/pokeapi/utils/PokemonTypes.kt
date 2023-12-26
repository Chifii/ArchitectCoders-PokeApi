package io.architeccoders.pokeapi.utils

object PokemonTypes {
	const val NORMAL = "normal"
	const val FIRE = "fire"
	const val WATER = "water"
	const val ELECTRIC = "electric"
	const val GRASS = "grass"
	const val ICE = "ice"
	const val FIGHTING = "fighting"
	const val POISON = "poison"
	const val GROUND = "ground"
	const val FLYING = "flying"
	const val PSYCHIC = "psychic"
	const val BUG = "bug"
	const val ROCK = "rock"
	const val GHOST = "ghost"
	const val DARK = "dark"
	const val STEEL = "steel"
	const val FAIRY = "fairy"
	const val DRAGON = "dragon"

	val allTypes = listOf(
		NORMAL, FIRE, WATER, ELECTRIC, GRASS, ICE, FIGHTING,
		POISON, GROUND, FLYING, PSYCHIC, BUG, ROCK, GHOST,
		DARK, STEEL, FAIRY
	)

	val typeColors = mapOf(
		NORMAL to "#A8A77A",
		FIRE to "#EE8130",
		WATER to "#6390F0",
		ELECTRIC to "#F7D02C",
		GRASS to "#7AC74C",
		ICE to "#96D9D6",
		FIGHTING to "#C22E28",
		POISON to "#A33EA1",
		GROUND to "#E2BF65",
		FLYING to "#A98FF3",
		PSYCHIC to "#F95587",
		BUG to "#A6B91A",
		ROCK to "#B6A136",
		GHOST to "#735797",
		DARK to "#705746",
		STEEL to "#B7B7CE",
		FAIRY to "#D685AD",
		DRAGON to "#6F35FC"
	)
}