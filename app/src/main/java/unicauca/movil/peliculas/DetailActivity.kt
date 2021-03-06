package unicauca.movil.peliculas

import android.content.Context
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.graphics.Palette
import android.view.Window
import android.view.WindowManager
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import unicauca.movil.peliculas.databinding.ActivityDetailBinding
import unicauca.movil.peliculas.util.Data

class DetailActivity : AppCompatActivity() {

    lateinit var binding:ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

       // setSupportActionBar(toolbar)

        val pos = intent.extras.getInt("pos", 0)
        val pelicula = Data.peliculas[pos]
        binding.pelicula = pelicula

       // collapsing.title = pelicula.nombre
       // Picasso.with(this)
            //    .load(Uri.parse(pelicula.imagen))
          //      .into(img, this)

    }
}
