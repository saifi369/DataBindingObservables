package com.saifi369.databindingobservables.viewmodel

import androidx.lifecycle.ViewModel
import com.saifi369.databindingobservables.model.Person

class MainViewModel : ViewModel() {

    var person = Person("Ali", 35)
}