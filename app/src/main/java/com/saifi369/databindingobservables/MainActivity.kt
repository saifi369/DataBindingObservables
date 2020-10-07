package com.saifi369.databindingobservables

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import com.saifi369.databindingobservables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val listData: ObservableArrayList<String> = ObservableArrayList()
    val mapData: ObservableArrayMap<String, Any> = ObservableArrayMap()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        listData.add("Ali")
        listData.add("Usman")
        listData.add("Hamza")

        mapData.put("name", "Ali")
        mapData.put("age", 35)

        binding.data = mapData
        binding.handler = this
    }

    fun onClick(view: View) {
        mapData.remove("name")
        mapData.remove("age")
    }
}
