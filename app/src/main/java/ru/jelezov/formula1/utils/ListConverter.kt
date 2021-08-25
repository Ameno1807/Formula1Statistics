package ru.jelezov.formula1.utils

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers.Constructor
import java.util.*

class ListConverter {

    @TypeConverter
    fun fromString(value: String?): List<Constructor>? {
        if (value == null) {
            return Collections.emptyList()
        }
        val listType = object : TypeToken<List<Constructor>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromListList(list: List<Constructor>?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }

}