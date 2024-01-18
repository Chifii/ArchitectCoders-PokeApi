package io.architeccoders.pokeapi.details.view.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import io.architeccoders.pokeapi.details.model.TabScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DetailBox(
	modifier: Modifier = Modifier
) {
	var state by remember { mutableStateOf(0) }

	val coroutineScope = rememberCoroutineScope()

	val tabRowItems = listOf(
		TabScreen(
			text = "About",
			icon = null,
			screen = {
				AboutBox()
			}
		),
		TabScreen(
			text = "Base Stats",
			icon = null,
			screen = {
				BaseStatsBox()
			}
		),
		TabScreen(
			text = "Evolutions",
			icon = null,
			screen = {
				EvolutionsBox()
			}
		)
	)

	val pagerState = rememberPagerState { tabRowItems.size }

	Box(modifier = modifier.background(Color.White)) {
		Column {
			TabRow(
				selectedTabIndex = state,
				modifier = Modifier.align(Alignment.CenterHorizontally)
			) {
				tabRowItems.forEachIndexed { index, item ->
					Tab(
						text = {
							Text(
								text = item.text, maxLines = 2,
								overflow = TextOverflow.Ellipsis
							)
						},
						selected = pagerState.currentPage == index,
						onClick = {
							state = index
							coroutineScope.launch { pagerState.animateScrollToPage(index) }
						},
						selectedContentColor = Color.Black,
						unselectedContentColor = Color.Gray
					)
				}
			}
			HorizontalPager(
				state = pagerState
			) {
				tabRowItems[pagerState.currentPage].screen()
			}
		}
	}
}

@Preview
@Composable
fun DetailBoxPreview() {
	DetailBox(
		modifier = Modifier
	)
}