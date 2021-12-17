package com.ersubhadip.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ersubhadip.counter.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)



        var counter = MainDataBinder("0")
        binding.setCount = counter


        binding.resetBtn.setOnClickListener {

           binding.counterLabel.text=(viewModel.resetData()).toString()

        }

        binding.incBtn.setOnClickListener {

            binding.counterLabel.text=(viewModel.increase()).toString()
        }


    }


}