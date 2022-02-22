package fr.isen.jal.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.jal.application.databinding.ActivityConnectionBinding


class ConnectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConnectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connection)
        listenClick()
    }

    private fun listenClick() {
        binding.buttonConnection.setOnClickListener {

        }
    }


}

