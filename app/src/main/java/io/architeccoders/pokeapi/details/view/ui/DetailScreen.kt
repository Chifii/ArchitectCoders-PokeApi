package io.architeccoders.pokeapi.details.view.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun DetailScreen(modifier: Modifier = Modifier) {
	Column(
		modifier = modifier
			.fillMaxHeight()
			.fillMaxWidth()
			.background(Color.White)
	) {
		Box(modifier = modifier.fillMaxWidth()) {
			Row(
				modifier = modifier
					.fillMaxWidth()
					.padding(16.dp),
				verticalAlignment = Alignment.CenterVertically,
				horizontalArrangement = Arrangement.SpaceBetween
			) {
				Column(
					modifier = modifier
				) {
					Text(
						text = "Bulbasaur",
						modifier = modifier
							.width(IntrinsicSize.Max)
							.padding(top = 2.dp, start = 4.dp),
						fontStyle = FontStyle.Normal,
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold
					)

					Row {
						OutlinedCard(
							modifier = modifier
								.width(IntrinsicSize.Max)
								.padding(top = 2.dp, start = 4.dp),
							colors = CardDefaults.outlinedCardColors(
								containerColor = Color.LightGray, contentColor = Color.White
							),
							border = CardDefaults.outlinedCardBorder(false),
						) {
							Text(
								text = "Grass",
								modifier = modifier
									.width(58.dp)
									.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
									.align(Alignment.CenterHorizontally),
								fontStyle = FontStyle.Normal,
								fontSize = 12.sp,
							)
						}

						OutlinedCard(
							modifier = modifier
								.width(IntrinsicSize.Max)
								.padding(top = 2.dp, start = 4.dp),
							colors = CardDefaults.outlinedCardColors(
								containerColor = Color.LightGray, contentColor = Color.White
							),
							border = CardDefaults.outlinedCardBorder(false),
						) {
							Text(
								text = "Poison",
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

				Text(
					text = "#001",
					modifier = modifier.padding(end = 16.dp),
					fontStyle = FontStyle.Normal,
					fontSize = 16.sp,
					fontWeight = FontWeight.Bold
				)
			}
		}

		Box(
			modifier = modifier
				.fillMaxWidth()
				.height(400.dp)

		) {
			Image(
				painter = painterResource(id = R.drawable.ic_launcher_background),
				contentDescription = "Bulbasaur",
				modifier = modifier
					.fillMaxWidth()
					.fillMaxHeight()
					.background(Color.LightGray)
			)
		}

		DetailBox(
			modifier = modifier.fillMaxWidth()
		)
	}
}

@Preview
@Composable
fun DetailScreenPreview() {
	DetailScreen()
}