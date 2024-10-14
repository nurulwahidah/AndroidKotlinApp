package nurul.polbeng.ac.id.androidkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import nurul.polbeng.ac.id.androidkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnResetNumber: Button
    private lateinit var btnSubtractNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnResetNumber = findViewById(R.id.btnResetNumber)
        btnSubtractNumber = findViewById(R.id.btnSubtractNumber)

        binding.tvCounter.text = "1"

        btnSubtractNumber.setOnClickListener { resetNumber(it) }
        btnResetNumber.setOnClickListener { subtractNumber(it) }
    }

    fun addNumber(v: View) {
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        binding.tvCounter.text = nextVal.toString()
    }

    fun subtractNumber(v: View) {
        binding.tvCounter.text = "0"
    }

    fun resetNumber(v: View) {
        val currVal = binding.tvCounter.text.toString().toInt()
        if (currVal > -1) {
            val nextVal = currVal - 1
            binding.tvCounter.text = nextVal.toString()
        }
    }
}

