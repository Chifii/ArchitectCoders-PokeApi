package io.architeccoders.pokeapi.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.home.model.PokemonBase
import io.architeccoders.pokeapi.home.repository.HomeRepositoryImpl
import io.architeccoders.pokeapi.utils.Result
import kotlinx.coroutines.launch

class HomeViewModel(
	private val repository: HomeRepositoryImpl
) : ViewModel() {
	private var pokemonListMLD: MutableLiveData<List<Pokemon>> = MutableLiveData()
	val pokemonList get() = pokemonListMLD as LiveData<List<Pokemon>>

	private var pokemonInitialList: List<PokemonBase> = mutableListOf()

	var offset = 0

	fun getInitialData() {
		viewModelScope.launch {
			when (val result = repository.loadInitialPokemonList(offset)) {
				is Result.Success -> {
					pokemonInitialList = result.data.results
					offset += 25

					getPokemonList()
					Log.d("HomeViewModel", "getInitialPokemonData: ${result.data}")
				}

				is Result.Error -> {
					pokemonListMLD.postValue(emptyList())
				}
			}
		}
	}

	private fun getPokemonList() {
		var pokemonFinalList: List<Pokemon> = mutableListOf()
		viewModelScope.launch {
			for (pokemon in pokemonInitialList) {
				Log.d("HomeViewModel", "getPokemonList: ${pokemon.name}")
				when (val result =
					repository.loadPokemonData(pokemonInitialList.indexOf(pokemon) + 1)) {
					is Result.Success -> {
						Log.d("HomeViewModel", "getPokemonList: ${result.data}")
						pokemonFinalList += result.data
					}

					is Result.Error -> {
						pokemonListMLD.postValue(emptyList())
					}
				}
			}

			pokemonListMLD.postValue(pokemonFinalList)
		}
	}
}
