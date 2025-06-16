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



        btnCold.setOnClickListener{

            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("ColdDrinks", 1)
            startActivity(intent)

        }

        btnHot.setOnClickListener{

            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("HotDrinks", 2)
            startActivity(intent)

        }

        btnSweet.setOnClickListener{

            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("Sweet", 3)
            startActivity(intent)

        }

        btnSalties.setOnClickListener{

            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("Salties", 4)
            startActivity(intent)

        }


    }
}