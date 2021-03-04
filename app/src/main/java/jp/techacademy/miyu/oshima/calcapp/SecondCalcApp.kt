package jp.techacademy.miyu.oshima.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class SecondCalcApp : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        val intent = getIntent()
        val result = intent.getStringExtra("result.text")
        textView.text = "${result}"
        Log.d("result.text", result.toString())
    }
}