package amos.olguin.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)


        var btnCold: Button = findViewById(R.id.buttonColdDrunks) as Button
        var btnHot: Button = findViewById(R.id.buttonHotDrunks) as Button
        var btnSweet: Button = findViewById(R.id.buttonSweet) as Button
        var btnSalties: Button = findViewById(R.id.buttonSalties) as Button

        val intent: Intent = Intent(this, ProductosActivity::class.java)

        btnCold.setOnClickListener{


            intent.putExtra("tipoProducto", 1)
            startActivity(intent)

        }

        btnHot.setOnClickListener{

            intent.putExtra("tipoProducto", 2)
            startActivity(intent)

        }

        btnSweet.setOnClickListener{

            intent.putExtra("tipoProducto", 3)
            startActivity(intent)

        }

        btnSalties.setOnClickListener{

            intent.putExtra("tipoProducto", 4)
            startActivity(intent)

        }


    }
}