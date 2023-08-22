package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {
    private val _quantity = MutableLiveData<Int>(0)
    private val _flavor = MutableLiveData<String>("")
    private val _date = MutableLiveData<String>("")
    private val _price = MutableLiveData<Double>(0.0)

    val quantity: LiveData<Int> = _quantity
    val flavor: LiveData<String> = _flavor
    val date: LiveData<String> = _date
    val price: LiveData<Double> = _price

    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
    }

    fun setFlavor(desiredFlavor: String) {
        _flavor.value = desiredFlavor
    }

    fun setDate(pickupDate: String) {
        _date.value = pickupDate
    }

    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }
}
