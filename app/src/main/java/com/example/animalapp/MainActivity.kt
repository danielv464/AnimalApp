package com.example.animalapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var speciesInput : EditText
    lateinit var usernameInput : EditText
    lateinit var seasonInput : EditText
    lateinit var passwordInput : EditText
    lateinit var accountButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        speciesInput = findViewById(R.id.species_input)
        usernameInput = findViewById(R.id.user_input)
        seasonInput = findViewById(R.id.season_input)
        passwordInput = findViewById(R.id.password_input)
        accountButton = findViewById(R.id.login_button)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        accountButton.setOnClickListener {
            val species = speciesInput.text.toString()
            val season = seasonInput.text.toString()
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Credentials", "Species : $species and Season : $season and Username :" +
                    " $username and Password : $password")

        }
    }
}