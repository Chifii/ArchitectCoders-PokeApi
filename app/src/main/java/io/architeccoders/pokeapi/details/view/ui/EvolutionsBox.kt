package io.architeccoders.pokeapi.details.view.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.architeccoders.pokeapi.R
import com.google.android.material.R as materialR

@Composable
fun EvolutionsBox() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.fillMaxHeight()
			.background(Color.White),
		contentAlignment = Alignment.Center
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(16.dp),
		) {
			Image(
				painter = painterResource(id = R.drawable.ic_launcher_background),
				contentDescription = "Bulbasaur",
				modifier = Modifier
					.width(70.dp)
					.height(70.dp)
					.background(Color.LightGray)
			)
			Spacer(modifier = Modifier.width(12.dp))
			Column(
				modifier = Modifier.padding(top = 12.dp),
				horizontalAlignment = Alignment.CenterHorizontally
			) {
				Text(text = "Level: 16")
				Icon(
					painter = painterResource(id = materialR.drawable.material_ic_keyboard_arrow_right_black_24dp),
					contentDescription = null
				)
			}
			Spacer(modifier = Modifier.width(12.dp))
			Image(
				painter = painterResource(id = R.drawable.ic_launcher_background),
				contentDescription = "Bulbasaur",
				modifier = Modifier
					.width(70.dp)
					.height(70.dp)
					.background(Color.LightGray)
			)
			Spacer(modifier = Modifier.width(12.dp))
			Column(
				modifier = Modifier.padding(top = 12.dp),
				horizontalAlignment = Alignment.CenterHorizontally
			) {
				Text(text = "Level: 36")
				Icon(
					painter = painterResource(id = materialR.drawable.material_ic_keyboard_arrow_right_black_24dp),
					contentDescription = null
				)
			}
			Spacer(modifier = Modifier.width(12.dp))
			Image(
				painter = painterResource(id = R.drawable.ic_launcher_background),
				contentDescription = "Bulbasaur",
				modifier = Modifier
					.width(70.dp)
					.height(70.dp)
					.background(Color.LightGray)
			)
		}
	}
}

@Preview
@Composable
fun EvolutionsBoxPreview() {
	EvolutionsBox()
}