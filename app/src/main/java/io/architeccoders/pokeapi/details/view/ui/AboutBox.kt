package io.architeccoders.pokeapi.details.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutBox() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.fillMaxHeight()
			.padding(start = 8.dp)
			.background(Color.White)
	) {
		Column {
			Row(
				modifier = Modifier.fillMaxWidth(),
				horizontalArrangement = Arrangement.Start
			) {
				Text(
					modifier = Modifier.width(100.dp),
					text = "Alto",
					fontStyle = FontStyle.Normal,
					fontSize = 18.sp,
					color = Color.Gray,
				)
				Text(
					modifier = Modifier.padding(start = 16.dp),
					text = "0.70 cm",
					fontStyle = FontStyle.Normal,
					fontSize = 18.sp,
					color = Color.Black,
				)
			}
			Row(
				modifier = Modifier
					.fillMaxWidth()
					.padding(top = 8.dp),
				horizontalArrangement = Arrangement.Start
			) {
				Text(
					modifier = Modifier.width(100.dp),
					text = "Peso",
					fontStyle = FontStyle.Normal,
					fontSize = 18.sp,
					color = Color.Gray,
				)
				Text(
					modifier = Modifier.padding(start = 16.dp),
					text = "6.9 kg",
					fontStyle = FontStyle.Normal,
					fontSize = 18.sp,
					color = Color.Black,
				)
			}
			Row(
				modifier = Modifier
					.fillMaxWidth()
					.padding(top = 8.dp),
				horizontalArrangement = Arrangement.Start
			) {
				Text(
					modifier = Modifier.width(100.dp),
					text = "Habilidades",
					fontStyle = FontStyle.Normal,
					fontSize = 18.sp,
					color = Color.Gray,
				)
				Text(
					modifier = Modifier.padding(start = 16.dp),
					text = "Semilla",
					fontStyle = FontStyle.Normal,
					fontSize = 18.sp,
					color = Color.Black,
				)
			}

		}
	}
}

@Preview
@Composable
fun AboutBoxPreview() {
	AboutBox()
}