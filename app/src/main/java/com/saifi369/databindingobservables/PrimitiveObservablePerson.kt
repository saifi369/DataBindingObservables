package com.saifi369.databindingobservables

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class PrimitiveObservablePerson(pName: String, pAge: Int) {

    var name: ObservableField<String> = ObservableField(pName)
    var age: ObservableInt = ObservableInt(pAge)
}