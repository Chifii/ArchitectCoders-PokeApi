package io.architeccoders.pokeapi.details.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BaseStatsBox() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.fillMaxHeight()
			.padding(start = 8.dp)
			.background(Color.White)
	) {
		LazyColumn {
			item { StatRow("Hp", "45", 45f) }
			item { StatRow("Attack", "60", 60f) }
			item { StatRow("Defense", "48", 48f) }
			item { StatRow("Sp. Atk", "65", 65f) }
			item { StatRow("Sp. Def", "65", 65f) }
			item { StatRow("Speed", "45", 45f) }
			item { StatRow("Total", "317", 175f, 300f) }
		}
	}
}

@Composable
fun StatRow(statName: String, statValue: String, currentValue: Float, totalValue: Float = 100f) {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(top = 8.dp),
		horizontalArrangement = Arrangement.Start
	) {
		Text(
			modifier = Modifier.width(100.dp),
			text = statName,
			fontStyle = FontStyle.Normal,
			fontSize = 18.sp,
			color = Color.Gray,
		)
		Text(
			modifier = Modifier.padding(start = 16.dp),
			text = statValue,
			fontStyle = FontStyle.Normal,
			fontSize = 18.sp,
			color = Color.Black,
		)
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(top = 12.dp, start = 16.dp),
			horizontalArrangement = Arrangement.Start
		) {
			CustomProgressBar(
				currentValue = currentValue,
				totalValue = totalValue
			)
		}
	}
}

@Composable
fun CustomProgressBar(currentValue: Float, totalValue: Float) {
	val percentage = currentValue / totalValue
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.padding(end = 16.dp)
			.height(2.dp)
			.background(Color.LightGray)
	) {
		Box(
			modifier = Modifier
				.fillMaxWidth(percentage)
				.height(2.dp)
				.background(Color.Red)
		)
	}
}

@Preview
@Composable
fun BaseStatsBoxPreview() {
	BaseStatsBox()
}