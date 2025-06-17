package amos.olguin.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.startedButton)
        val etName: EditText = findViewById(R.id.nameET)
        val lastNameET: EditText = findViewById(R.id.lastNameET)
        val emailET: EditText = findViewById(R.id.emailET)
        val passwordET: EditText = findViewById(R.id.passwordET)
        val checkBoxConditions: CheckBox = findViewById(R.id.checkBox)

        button.setOnClickListener{

            if(!checkBoxConditions.isChecked){

                Toast.makeText(this, "Para continuar, acepte los terminos y condiciones", Toast.LENGTH_SHORT).show()


            }else if (etName.text.toString().isBlank() || passwordET.text.toString().isBlank() || emailET.text.toString().isBlank() || lastNameET.text.toString().isBlank()){

                Toast.makeText(this, "Debe llenar todos los campos de texto para continuar", Toast.LENGTH_SHORT).show()

            }


            else{
                var intent: Intent = Intent(this, ActivityMenu::class.java)
                startActivity(intent)
            }



        }
    }
}