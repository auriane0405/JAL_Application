package fr.isen.jal.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.jal.application.databinding.ActivityHomeBinding

lateinit var binding: ActivityHomeBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_connection)
    }
}