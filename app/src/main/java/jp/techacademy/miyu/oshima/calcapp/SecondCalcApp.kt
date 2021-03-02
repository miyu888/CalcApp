package jp.techacademy.miyu.oshima.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class SecondCalcApp : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        buttonplus.setOnClickListener(this)
        buttonminus.setOnClickListener(this)
        buttonmultiply.setOnClickListener(this)
        buttondivide.setOnClickListener(this)

        val value1 = intent.getIntExtra("VALUE1",0)
        val value2 = intent.getIntExtra("VALUE2",0)

        textView.text = "${value1 + value2}"

    }

    override fun onClick(v: View){

        val plus = editText1.text.toString().toInt() + editText2.text.toString().toInt()
        val minus = editText1.text.toString().toInt() - editText2.text.toString().toInt()
        val multiplize = editText1.text.toString().toInt() * editText2.text.toString().toInt()
        val divide = editText1.text.toString().toInt() / editText2.text.toString().toInt()

        when(v.id){
            R.id.buttonplus -> textView.text = plus.toString()
            R.id.buttonminus -> textView.text = minus.toString()
            R.id.buttonmultiply -> textView.text = multiplize.toString()
            R.id.buttondivide -> textView.text = divide.toString()
        }
    }
}