package io.architeccoders.pokeapi.home.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import io.architeccoders.pokeapi.R
import io.architeccoders.pokeapi.home.repository.HomeRepositoryImpl
import io.architeccoders.pokeapi.home.viewModel.HomeViewModel

@Composable
fun HomeScreen(
	modifier: Modifier = Modifier,
	viewModel: HomeViewModel
) {
	val showLoader = remember { mutableStateOf(true) }
	val pokemonList = viewModel.pokemonList.observeAsState()

	Column(
		modifier = modifier
			.fillMaxWidth()
			.fillMaxHeight()
			.padding(2.dp)
			.background(color = Color.White),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {
		if (pokemonList.value == null) {
			Loader(showLoader.value)
		} else {
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
}

@Composable
fun Loader(showLoader: Boolean) {
	if (showLoader) {
		val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.pokeball_loading))
		val progress by animateLottieCompositionAsState(composition)
		LottieAnimation(
			composition = composition,
			progress = { progress },
			modifier = Modifier
				.width(150.dp)
				.height(150.dp)
				.padding(16.dp)
		)
		Text(text = "Cargando...", fontSize = 16.sp, color = Color(0xFF212121))
	}
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
	HomeScreen(viewModel = HomeViewModel(HomeRepositoryImpl()))
}