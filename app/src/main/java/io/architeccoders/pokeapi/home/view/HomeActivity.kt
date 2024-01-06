package io.architeccoders.pokeapi.home.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import io.architeccoders.pokeapi.databinding.ActivityHomeBinding
import io.architeccoders.pokeapi.home.repository.HomeRepositoryImpl
import io.architeccoders.pokeapi.home.view.ui.HomeScreen
import io.architeccoders.pokeapi.home.viewModel.HomeViewModel

class HomeActivity : AppCompatActivity() {

	private var viewModel = HomeViewModel(HomeRepositoryImpl())

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val binding = ActivityHomeBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setContent {
			HomeScreen(
				viewModel = viewModel
			)
		}

		viewModel.getInitialData()
	}
}