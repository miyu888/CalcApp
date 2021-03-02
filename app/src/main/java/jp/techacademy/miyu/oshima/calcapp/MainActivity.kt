package jp.techacademy.miyu.oshima.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

        //var nStr : String = ""
        //var nlist = ArrayList<Double>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "計算する"


        buttonplus.text = "Plus"
        buttonplus.setOnClickListener{
            //val fomula = editText1 + editText2
            //SecondCalcApp.text = editText1.text.toString()
            val intent = Intent(this, SecondCalcApp::class.java)
            intent.putExtra("VALUE1", 10)
            intent.putExtra("VALUE2",20)
            startActivity(intent)

            if("VALLUE1" == null || "VALLUE2"== null) {
                buttonplus.setOnClickListener { view ->
                    Snackbar.make(view, "数値を正確に入力してください", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Undo") {}.show()
                }
            }
        }

        buttonminus.text = "Minus"
        buttonminus.setOnClickListener{
            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            buttonminus.setOnClickListener{view ->
                Snackbar.make(view,"数値を正確に入力してください",Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo"){}.show()
            }
        }

        buttonmultiply.text = "multiplize"
        buttonmultiply.setOnClickListener{
            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            buttonmultiply.setOnClickListener{view ->
                Snackbar.make(view,"数値を正確に入力してください",Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo"){}.show()
            }
        }

        buttondivide.text = "divide"
        buttondivide.setOnClickListener{
            val intent = Intent(this, SecondCalcApp::class.java)
            startActivity(intent)

            buttondivide.setOnClickListener{view ->
                Snackbar.make(view,"数値を正確に入力してください",Snackbar.LENGTH_INDEFINITE)
                    .setAction("Undo"){}.show()
            }
        }

    }


}