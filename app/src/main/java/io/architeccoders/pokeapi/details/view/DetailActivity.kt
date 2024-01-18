package io.architeccoders.pokeapi.details.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import io.architeccoders.pokeapi.databinding.ActivityDetailsBinding
import io.architeccoders.pokeapi.details.view.ui.DetailScreen
import io.architeccoders.pokeapi.details.viewModel.DetailViewModel

class DetailActivity : AppCompatActivity() {
	private var viewModel = DetailViewModel()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		val binding = ActivityDetailsBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setContent {
			DetailScreen(
				// viewModel = viewModel
			)
		}
	}
}
