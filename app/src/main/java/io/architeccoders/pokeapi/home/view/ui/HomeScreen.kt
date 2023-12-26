package io.architeccoders.pokeapi.home.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.architeccoders.pokeapi.home.repository.HomeRepositoryImpl
import io.architeccoders.pokeapi.home.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
	modifier: Modifier = Modifier,
	viewModel: HomeViewModel
) {

	val pokemonList = viewModel.pokemonList.observeAsState()

	Column(
		modifier = modifier
			.fillMaxWidth()
			.padding(2.dp)
			.background(color = Color.White)
	) {
		Text(
			text = "Pokedex",
			fontWeight = FontWeight.Bold,
			fontSize = 24.sp,
			modifier = modifier.padding(start = 24.dp, top = 8.dp, bottom = 12.dp),
			color = Color(0xFF212121)
		)
		Spacer(
			modifier = modifier
				.fillMaxWidth()
				.padding(2.dp)
		)
		LazyVerticalGrid(
			modifier = modifier
				.fillMaxWidth()
				.padding(start = 12.dp, end = 12.dp),
			columns = GridCells.Fixed(2), content = {
				for (pokemon in pokemonList.value ?: emptyList()) {
					item {
						HomeItems(modifier = modifier, pokemon)
					}
				}
			}
		)
	}
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
	HomeScreen(viewModel = HomeViewModel(HomeRepositoryImpl()))
}