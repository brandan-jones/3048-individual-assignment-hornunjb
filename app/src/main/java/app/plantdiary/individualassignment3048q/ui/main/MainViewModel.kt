package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Plant>> = MutableLiveData()
    var countryService: CountryService = CountryService()

    fun fetchCountries(countryName: String) {
        countries = countryService.fetchCountries(countryName)
    }
}
