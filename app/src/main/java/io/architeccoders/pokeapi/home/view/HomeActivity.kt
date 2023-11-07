package io.architeccoders.pokeapi.home.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.challenge.stori.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val binding = ActivityHomeBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}