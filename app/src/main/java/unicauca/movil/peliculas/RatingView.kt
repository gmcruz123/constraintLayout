package unicauca.movil.peliculas
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

class RatingView : FrameLayout {


    // Un class view -> es un view personalizado el cual encapsula un set especifico de funcionalidades
    // El constructor permite al editor del layout crear y editar una isntancia del view.

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }



    fun init(attributeSet: AttributeSet?) {
        val attributes = context.theme.obtainStyledAttributes(attributeSet, R.styleable.MovieRatingView, 0, 0)
        val ratingText: Float
        try {
            ratingText = attributes.getFloat(R.styleable.MovieRatingView_rating, 0f)
        } finally {
            attributes.recycle()
        }
        // inflate : cargar el layout
        View.inflate(context, R.layout.rating_badge, this)


        val ratingTextView = findViewById<TextView>(R.id.text_view_rating_text)
        ratingTextView.text = ratingText.toString()

    }
}
