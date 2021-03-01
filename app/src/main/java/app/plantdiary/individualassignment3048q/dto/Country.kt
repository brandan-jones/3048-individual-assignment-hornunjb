package app.plantdiary.individualassignment3048q.dto

data class Country(var Code: String, var Name: String) {
    override fun toString(): String {
        return Name
    }
}