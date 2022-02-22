package fr.isen.jal.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.fragment_connection)
    }
}