package com.saifi369.databindingobservables;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;

//For Java Developers
class JavaPerson implements Observable {

    private String javaName;
    private int javaAge;

    @Bindable
    public String getJavaJavaName() {
        //javaName
        return javaName;
    }

    public void setJavaName(String javaName) {
        this.javaName = javaName;
    }

    public int getJavaAge() {
        return javaAge;
    }

    public void setJavaAge(int javaAge) {
        this.javaAge = javaAge;
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
}
