package jp.techacademy.miyu.oshima.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        buttonplus.setOnClickListener { view ->
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
                return@setOnClickListener
            }
            result.text = (getNumber1() + getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
            intent.putExtra("result", result.text.toString()) //第一引数Key、第二引数渡したい値
            startActivity(intent)

        }

        buttonminus.text = "Minus"
        buttonminus.setOnClickListener{view ->
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
                return@setOnClickListener
            }
            result.text = "0"
            result.text = (getNumber1() - getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
                intent.putExtra("result", result.text.toString())
            startActivity(intent)

        }

        buttonmultiply.text = "multiplize"
        buttonmultiply.setOnClickListener{view ->
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
                return@setOnClickListener
            }

            result.text = "0"
            result.text = (getNumber1() * getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
                intent.putExtra("result", result.text.toString())
            startActivity(intent)

        }

        buttondivide.text = "divide"
        buttondivide.setOnClickListener{view ->
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo") {}.show()
                return@setOnClickListener
            }
            result.text = "0"
            result.text = (getNumber1() / getNumber2()).toString()

            val intent = Intent(this, SecondCalcApp::class.java)
                intent.putExtra("result", result.text.toString())
            startActivity(intent)

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