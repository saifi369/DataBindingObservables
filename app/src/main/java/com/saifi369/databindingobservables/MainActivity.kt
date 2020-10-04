package com.saifi369.databindingobservables

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saifi369.databindingobservables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val person = Person("Ali",35)
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.person = person
        binding.handler = this
    }

    fun onClick(view: View){
        Toast.makeText(this, "Person age is ${person.age}", Toast.LENGTH_SHORT).show()
    }
}

data class Person(var name:String,var age:Int)