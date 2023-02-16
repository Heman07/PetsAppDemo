package com.heman.sepiapetsapp.repository

import android.app.Application
import com.heman.sepiapetsapp.model.PetList

class Repository(application: Application) {

    private val fetchData = FetchData(application)

     fun getPetListData(): PetList {
        return fetchData.getPetList();
    }

    fun getWorkTime(): String {
        return fetchData.getWorkTime();
    }
}