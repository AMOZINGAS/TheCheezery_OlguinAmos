package amos.olguin.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



            val getStarted: Button = findViewById(R.id.startedButton)

            getStarted.setOnClickListener{

                var intent: Intent = Intent(this, RegisterActivity::class.java)

                startActivity(intent)

            }

        }






}class RegisterActivity