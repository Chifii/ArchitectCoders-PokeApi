package io.architeccoders.pokeapi.details.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

data class TabScreen(
	val text: String,
	val icon: ImageVector?,
	val screen: @Composable () -> Unit
)