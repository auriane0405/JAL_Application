package fr.isen.jal.application

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import fr.isen.jal.application.databinding.ActivityConnectionBinding
import fr.isen.jal.application.databinding.ActivityCreationBinding
import fr.isen.jal.application.databinding.ActivityHomeBinding

class CreationActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreationBinding
    lateinit var buttonSeConnecter: Button
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creation)
        auth = Firebase.auth
        buttonSeConnecter = findViewById(R.id.buttonSeConnecter)
        val IntentConnecter: Intent = Intent(this, ConnectionActivity::class.java)
        buttonSeConnecter.setOnClickListener {
            startActivity(IntentConnecter)
        }
    }
}

