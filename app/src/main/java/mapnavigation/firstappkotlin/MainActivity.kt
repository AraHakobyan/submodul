package mapnavigation.firstappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arr : ArrayList<TextView> = arrayListOf(num_0,num_1,num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_dot)
        val arrMath : ArrayList<TextView> = arrayListOf(math_div, math_minus, math_plus, math_div, math_equal)
        for (item in arr ){
            item.setOnClickListener {
                f_calc(item.text.toString())
            }
        }
    }

    private fun f_calc(s : String) {
        calc_view.text =  calc_view.text.toString() + s
    }
}

