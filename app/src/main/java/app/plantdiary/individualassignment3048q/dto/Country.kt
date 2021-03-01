package app.plantdiary.individualassignment3048q.dto

import com.google.gson.annotations.SerializedName

data class Country(@SerializedName("code")var code: String, @SerializedName("name") var name: String) {
    override fun toString(): String {
        var nameAndCode = name + " " + code
        return nameAndCode
    }
}