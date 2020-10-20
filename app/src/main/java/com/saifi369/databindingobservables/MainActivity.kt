package com.saifi369.databindingobservables

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.saifi369.databindingobservables.databinding.ActivityMainBinding
import com.saifi369.databindingobservables.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.handler = this
        binding.mainViewModel = viewModel
    }

    fun onClick(view: View) {
        viewModel.person.name = "Usman"
        viewModel.person.age = 45
    }
}
