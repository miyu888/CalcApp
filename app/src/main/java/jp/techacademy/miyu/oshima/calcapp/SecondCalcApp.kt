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

        val result = intent.getSerializableExtra("result.text") as MainActivity
        Log.d("receiveObject::", result.toString())
    }
}