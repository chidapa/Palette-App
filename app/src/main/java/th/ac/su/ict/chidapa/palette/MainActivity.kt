package th.ac.su.ict.chidapa.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtInput = findViewById<TextView>(R.id.v1)
        var buttoninput = findViewById<Button>(R.id.b1)
        var buttoninput1 = findViewById<Button>(R.id.b2)
        var buttoninput2 = findViewById<Button>(R.id.b3)
        var buttoninput3 = findViewById<Button>(R.id.b4)
        var buttoninput4 = findViewById<Button>(R.id.b5)
        var buttoninput5 = findViewById<Button>(R.id.b6)

        buttoninput.setOnClickListener {


                edtInput.setBackgroundColor(Color.rgb(233,225,222));
                edtInput.setText("233-225-222");

            }

        buttoninput1.setOnClickListener {


            edtInput.setBackgroundColor(Color.rgb(231,204,203));
            edtInput.setText("231-204-203");

        }
        buttoninput2.setOnClickListener {


            edtInput.setBackgroundColor(Color.rgb(119,131,154));
            edtInput.setText("119-131-154");

        }
        buttoninput3.setOnClickListener {


            edtInput.setBackgroundColor(Color.rgb(156,169,189));
            edtInput.setText("156-169-189");

        }
        buttoninput4.setOnClickListener {


            edtInput.setBackgroundColor(Color.rgb(196,204,212));
            edtInput.setText("196-204-212");

        }
        buttoninput5.setOnClickListener {


            edtInput.setBackgroundColor(Color.rgb(222,226,229));
            edtInput.setText("222-226-229");

        }



    }
}
