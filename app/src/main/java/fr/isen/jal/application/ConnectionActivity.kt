package fr.isen.jal.application

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import fr.isen.jal.application.databinding.ActivityConnectionBinding



class ConnectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConnectionBinding
    lateinit var buttonConnection : Button
    lateinit var buttonPasCompte : Button
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        setContentView(R.layout.activity_connection)

        buttonPasCompte = findViewById(R.id.buttonPasCompte)
        val monIntent: Intent = Intent(this, CreationActivity::class.java)
        buttonPasCompte.setOnClickListener {
            startActivity(monIntent)
        }
    }

}





