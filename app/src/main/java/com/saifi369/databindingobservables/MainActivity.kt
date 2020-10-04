package com.saifi369.databindingobservables

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.saifi369.databindingobservables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var person: ObservableField<PrimitiveObservablePerson> =
        ObservableField(PrimitiveObservablePerson("Ali", 35))
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.person = person
        binding.handler = this
    }

    fun onClick(view: View) {
        person.set(PrimitiveObservablePerson("AA", 100))
//        person.get()?.name?.set("Usman")
        Toast.makeText(this, "Person age is ${person.get()?.age?.get()}", Toast.LENGTH_SHORT).show()
    }
}
