package fr.isen.jal.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.jal.application.databinding.ActivityHomeBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}