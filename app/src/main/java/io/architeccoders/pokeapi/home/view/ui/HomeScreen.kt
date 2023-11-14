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
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
	modifier: Modifier = Modifier
) {
	Column {
		TopAppBar(title = {
			Text(
				modifier = modifier
					.fillMaxWidth(),
				text = "PokeAPI"
			)
		})

		Spacer(modifier = modifier.fillMaxWidth())

		Column(
			modifier = modifier
				.fillMaxWidth()
				.padding(2.dp)
				.background(color = Color.White)
		) {
			Text(text = "Hello, world!")
			Spacer(
				modifier = modifier
					.fillMaxWidth()
					.padding(2.dp)
			)
			LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
				items(10) {
					HomeItems(modifier = modifier)
				}
			})
		}
	}
}

@Preview
@Composable
fun HomeScreenPreview() {
	HomeScreen()
}