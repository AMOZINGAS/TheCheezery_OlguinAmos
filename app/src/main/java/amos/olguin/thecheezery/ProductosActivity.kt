package amos.olguin.thecheezery

import android.content.Context
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {

    var selectedProducts = ArrayList<Product>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        val buttonHome: Button = findViewById(R.id.homeButton)
        val image: ImageView = findViewById(R.id.nombreProducto_img)

        val tipo = intent.getIntExtra("tipoProducto", 0)

        when (tipo) {
            1 -> {
                agregarProductoCold()
                image.setImageResource(R.drawable.cold_drinks)
            }
            2 -> {
                agregarProductosHot()
                image.setImageResource(R.drawable.hot_drinks)
            }
            3 -> {
                agregarProductosSweet()
                image.setImageResource(R.drawable.sweets)
            }
            4 -> {
                agregarProductosSaltie()
                image.setImageResource(R.drawable.salties)
            }
            else -> {

            }


        }

        var listView: ListView = findViewById(R.id.listView) as ListView
        var adaptador: AdaptadorProductos = AdaptadorProductos(this, selectedProducts)

        listView.adapter = adaptador

        buttonHome.setOnClickListener{

            val intentButton: Intent = Intent(this, ActivityMenu::class.java)
            startActivity(intentButton)

        }

    }

    fun agregarProductoCold(){

        selectedProducts.add(Product("Caramel Frap", R.drawable.caramel_frap, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5.0))
        selectedProducts.add(Product("Chocolate Frap", R.drawable.chocolate_frap, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", 6.0))
        selectedProducts.add(Product("Cold Brew", R.drawable.coldbrew, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3.0))
        selectedProducts.add(Product("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4.0))
        selectedProducts.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7.0))
        selectedProducts.add(Product("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7.0))

    }

    fun agregarProductosHot(){

        selectedProducts.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6.0))
        selectedProducts.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5.0))
        selectedProducts.add(Product("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4.0))
        selectedProducts.add(Product("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6.0))
        selectedProducts.add(Product("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7.0))
        selectedProducts.add(Product("American coffee", R.drawable.americano, "Espresso with hot water", 2.0))

    }

    fun agregarProductosSweet(){

        selectedProducts.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6.0))
        selectedProducts.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3.0))
        selectedProducts.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4.0))
        selectedProducts.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6.0))
        selectedProducts.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7.0))
        selectedProducts.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6.0))

    }

    fun agregarProductosSaltie(){

        selectedProducts.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
        selectedProducts.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5.0))
        selectedProducts.add(Product("Panini", R.drawable.hampanini, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
        selectedProducts.add(Product("Philly cheese steak", R.drawable. phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
        selectedProducts.add(Product("Nachos", R.drawable. nachos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))

    }

    private class AdaptadorProductos: BaseAdapter{

        var products = ArrayList<Product>()

        var context: Context? = null

        constructor(contexto: Context, productos: ArrayList<Product>){

            this.context = contexto
            this.products = productos

        }

        override fun getCount(): Int {
            return products.count()
        }

        override fun getItem(position: Int): Any {
            return products[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var prod = products[position]
            var inflador = LayoutInflater.from((context))
            var vista = inflador.inflate(R.layout.procuto_view, null)

            var image = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_name) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var price = vista.findViewById(R.id.producto_precio) as TextView

            image.setImageResource(prod.img)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            price.setText("$${prod.price}")

            return vista

        }


    }


}


























