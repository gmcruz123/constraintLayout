package unicauca.movil.peliculas

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import unicauca.movil.peliculas.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        putFragment(R.id.container1, MainFragment.instance(Color.rgb(255, 0, 0)
                , "Rojo"))

        putFragment(R.id.container2, MainFragment.instance(Color.rgb(0, 0, 255)
                , "Azul"))

    }

    fun putFragment(container: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(container, fragment)
                .commit()
    }
}
