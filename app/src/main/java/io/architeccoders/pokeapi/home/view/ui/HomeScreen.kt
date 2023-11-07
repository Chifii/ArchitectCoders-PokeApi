package io.architeccoders.pokeapi.home.view.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
	modifier: Modifier = Modifier
) {
	TopAppBar(title = { Text(text = "PokeAPI") })
}

@Preview
@Composable
fun HomeScreenPreview() {
	HomeScreen()
}