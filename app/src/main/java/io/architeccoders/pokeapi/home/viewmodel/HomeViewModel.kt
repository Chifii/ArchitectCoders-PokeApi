package io.architeccoders.pokeapi.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.home.repository.HomeRepositoryImpl
import io.architeccoders.pokeapi.utils.Result
import kotlinx.coroutines.launch

class HomeViewModel(
	private val repository: HomeRepositoryImpl
) : ViewModel() {
	private var pokemonListMLD: MutableLiveData<List<Pokemon>> = MutableLiveData()
	val pokemonList get() = pokemonListMLD.value as LiveData<List<Pokemon>>

	fun getInitialData() {
		viewModelScope.launch {
			when (val result = repository.loadPokemonList()) {
				is Result.Success -> pokemonListMLD.postValue(result.data)
				is Result.Error -> pokemonListMLD.postValue(emptyList())
			}
		}
	}
}
