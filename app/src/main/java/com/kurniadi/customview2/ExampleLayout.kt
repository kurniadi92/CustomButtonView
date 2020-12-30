package com.kurniadi.customview2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class ExampleLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {

        // get the inflater service from the android system
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        // inflate the layout into "this" component
        inflater.inflate(R.layout.example_layout, this)

        // finally, we set the background of our component
//        setBackgroundResource(R.drawable.round_file_descriptor_background)

//        findViewById<Button>(R.id.button).setOnClickListener {
//            println(">>> hayo loh")
//        }

    }
}