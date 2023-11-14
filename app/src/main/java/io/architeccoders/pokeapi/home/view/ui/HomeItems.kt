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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.architeccoders.pokeapi.R

@Composable
fun HomeItems(
	modifier: Modifier = Modifier
) {
	Card(
		modifier = modifier
			.width(250.dp)
			.height(170.dp)
			.padding(2.dp),
		colors = CardDefaults.cardColors(
			containerColor = Color.Green,
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
					text = "Bulbasaur",
					modifier = modifier,
					fontStyle = FontStyle.Normal,
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold
				)
				Column(
					modifier = modifier
						.align(Alignment.Start),
					verticalArrangement = Arrangement.SpaceEvenly,
					horizontalAlignment = Alignment.Start
				) {
					OutlinedCard(
						modifier = modifier
							.width(IntrinsicSize.Max),
						colors = CardDefaults.outlinedCardColors(
							containerColor = Color.LightGray,
							contentColor = Color.White
						),
						border = CardDefaults.outlinedCardBorder(false),
					) {
						Text(
							text = "Grass",
							modifier = modifier
								.width(56.dp)
								.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
								.align(Alignment.CenterHorizontally),
							fontStyle = FontStyle.Normal,
							fontSize = 12.sp,
						)
					}
					OutlinedCard(
						modifier = modifier
							.width(IntrinsicSize.Max)
							.padding(top = 2.dp),
						colors = CardDefaults.outlinedCardColors(
							containerColor = Color.LightGray,
							contentColor = Color.White
						),
						border = CardDefaults.outlinedCardBorder(false),
					) {
						Text(
							text = "Poison",
							modifier = modifier
								.width(56.dp)
								.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
								.align(Alignment.CenterHorizontally),
							fontStyle = FontStyle.Normal,
							fontSize = 12.sp,
						)
					}
				}
			}

			Image(
				painter = painterResource(id = R.drawable.ic_launcher_background),
				contentDescription = "Bulbasaur",
				modifier = modifier
					.size(120.dp)
					.padding(8.dp)
					.align(Alignment.BottomEnd),
			)
		}
	}
}

@Preview
@Composable
fun HomeItemsPreview() {
	HomeItems()
}