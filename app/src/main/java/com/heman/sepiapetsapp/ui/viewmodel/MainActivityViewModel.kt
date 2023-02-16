package com.heman.sepiapetsapp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.heman.sepiapetsapp.model.PetList
import com.heman.sepiapetsapp.repository.Repository
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application): AndroidViewModel(application){

    private val repository = Repository(application)
    private val _petList: MutableLiveData<PetList> = MutableLiveData()
    val petList: LiveData<PetList> = _petList

    init {
        getPetList()
    }

    private fun getPetList() = viewModelScope.launch {
        _petList.value = repository.getPetListData()
    }

    fun getWorkTime(): String {
        return repository.getWorkTime();
    }
}