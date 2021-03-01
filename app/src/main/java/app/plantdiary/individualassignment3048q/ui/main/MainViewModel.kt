package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService

class MainViewModel : ViewModel() {
    var _countries: MutableLiveData<ArrayList<Country>> = MutableLiveData()
    var countryService: CountryService = CountryService()

    init {
        fetchCountries()
    }

    fun fetchCountries() {
        _countries = countryService.fetchCountries()
    }

    internal var countries:MutableLiveData<ArrayList<Country>>
        get() {return _countries}
        set(value) {_countries = value}

}
