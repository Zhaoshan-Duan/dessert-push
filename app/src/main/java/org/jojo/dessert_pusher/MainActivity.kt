package org.jojo.dessert_pusher

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import org.jojo.dessert_pusher.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private var revenue = 0
    private var dessertsSold = 0

    data class Dessert(val imageId: Int, val price: Int, val startProductionAmount: Int)

    private val allDesserts = listOf<Dessert>()
   // private var currentDessert = allDesserts.first()



    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate called")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.dessertButton.setOnClickListener {
            //onDessertClicked()
        }

        binding.revenue = revenue
        binding.amountSold = dessertsSold

    //    binding.dessertButton.setImageResource(currentDessert.imageId)

    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called")
    }
}