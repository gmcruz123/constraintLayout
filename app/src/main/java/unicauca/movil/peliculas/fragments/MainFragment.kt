package unicauca.movil.peliculas.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import unicauca.movil.peliculas.R


class MainFragment : Fragment() {

    lateinit var info:TextView
    val color:Int by lazy{ arguments!!.getInt("color") }
    val msg:String by lazy{ arguments!!.getString("msg") }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        info = view.findViewById(R.id.info)
        info.text = msg
        info.setBackgroundColor(color)
        return view
    }

    fun changeColor(color:Int){
        info.setBackgroundColor(color)
    }

    companion object {

        fun instance(color:Int, msg:String):MainFragment{
            val fragment = MainFragment()

            val args = Bundle()
            args.putInt("color", color)
            args.putString("msg", msg)
            fragment.arguments = args

            return fragment
        }

    }

}
