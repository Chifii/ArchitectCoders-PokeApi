package io.architeccoders.pokeapi.home.view

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import io.architeccoders.pokeapi.databinding.ActivityHomeBinding
import io.architeccoders.pokeapi.home.view.ui.HomeScreen

class HomeActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val binding = ActivityHomeBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setContent{
			HomeScreen()
		}
	}
}