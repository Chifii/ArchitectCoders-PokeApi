package io.architeccoders.pokeapi.home.view.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import io.architeccoders.pokeapi.home.model.Pokemon
import io.architeccoders.pokeapi.utils.PokemonTypes
import java.util.Locale

@Composable
fun HomeItems(
	modifier: Modifier = Modifier,
	pokemon: Pokemon
) {
	val pokemonTypeColor = Color(
		android.graphics.Color.parseColor(
			PokemonTypes.typeColors[pokemon.types.first().type.name] ?: "#FFFFFF"
		)
	)

	Card(
		modifier = modifier
			.width(250.dp)
			.height(150.dp)
			.padding(6.dp),
		colors = CardDefaults.cardColors(
			containerColor = pokemonTypeColor,
			contentColor = Color.White
		)
	) {
		Box(
			modifier = modifier
				.fillMaxSize()
		) {
			Column(
				modifier = modifier
					.fillMaxWidth()
					.padding(6.dp)
			) {
				Text(
					text = pokemon.name.replaceFirstChar {
						if (it.isLowerCase()) it.titlecase(
							Locale.getDefault()
						) else it.toString()
					},
					modifier = modifier.padding(start = 4.dp),
					fontStyle = FontStyle.Normal,
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold
				)
				Column(
					modifier = modifier
						.align(Alignment.Start),
					verticalArrangement = Arrangement.SpaceEvenly
				) {
					pokemon.types.forEach { type ->
						OutlinedCard(
							modifier = modifier
								.width(IntrinsicSize.Max)
								.padding(top = if (type == pokemon.types.first()) 0.dp else 2.dp, start = 4.dp),
							colors = CardDefaults.outlinedCardColors(
								containerColor = Color.LightGray,
								contentColor = Color.White
							),
							border = CardDefaults.outlinedCardBorder(false),
						) {
							Text(
								text = type.type.name.replaceFirstChar {
									if (it.isLowerCase()) it.titlecase(
										Locale.getDefault()
									) else it.toString()
								},
								modifier = modifier
									.width(58.dp)
									.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
									.align(Alignment.CenterHorizontally),
								fontStyle = FontStyle.Normal,
								fontSize = 12.sp,
							)
						}
					}
				}
			}

			Image(
				painter = rememberImagePainter(data = pokemon.sprites.frontDefault),
				contentDescription = pokemon.name,
				modifier = modifier
					.size(120.dp)
					.padding(8.dp)
					.align(Alignment.BottomEnd),
			)
		}
	}
}
