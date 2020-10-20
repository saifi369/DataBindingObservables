package com.saifi369.databindingobservables

import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry

class ObservablePerson(pName: String, pAge: Int) : Observable {

//    @get:Bindable
//    var name: String = pName
//        set(value) {
//            field = value
//            listener.notifyChange(this, BR.name)
//        }
//
//    //    @Bindable
////    get() {
////        return field.toUpperCase()
////    }
//    @get:Bindable
//    var age: Int = pAge
//        set(value) {
//            field = value
//            listener.notifyChange(this, BR.age)
//        }

    val listener: PropertyChangeRegistry = PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listener.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listener.remove(callback)
    }
}