package jp.techacademy.miyu.oshima.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

        //var nStr : String = ""
        //var nlist = ArrayList<Double>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "計算する"
        val result = findViewById(R.id.textView) as TextView


        buttonplus.text = "Plus"
        buttonplus.setOnClickListener{view ->
            result.text = (getNumber1() + getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
            }
        }

        buttonminus.text = "Minus"
        buttonminus.setOnClickListener{view ->
            result.text = "0"
            result.text = (getNumber1() - getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
            }
        }

        buttonmultiply.text = "multiplize"
        buttonmultiply.setOnClickListener{view ->
            result.text = "0"
            result.text = (getNumber1() * getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
            }
        }

        buttondivide.text = "divide"
        buttondivide.setOnClickListener{view ->
            result.text = "0"
            result.text = (getNumber1() / getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
            }
        }

    }

    fun getNumber1():Int {
        val fomula1 = findViewById(R.id.editText1) as EditText
        return Integer.parseInt(fomula1.text.toString())
    }

    fun getNumber2():Int{
        val fomula2 = findViewById(R.id.editText2) as EditText
        return Integer.parseInt(fomula2.text.toString())

    }

}