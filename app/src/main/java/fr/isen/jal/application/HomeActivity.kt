package fr.isen.jal.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import fr.isen.jal.application.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    lateinit var buttonConnecter: Button
    lateinit var buttonInscrire: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonConnecter = findViewById(R.id.buttonConnecter)
        val IntentConnection : Intent =  Intent(this,ConnectionActivity::class.java)
        buttonConnecter.setOnClickListener {
            startActivity(IntentConnection)
        }
        buttonInscrire = findViewById(R.id.buttonInscrire)
        val IntentInscription : Intent = Intent(this,CreationActivity::class.java)
        buttonInscrire.setOnClickListener {
            startActivity(IntentInscription)
        }
    }
}

