package com.example.justcode_motion_hw

import android.content.Context

object CityListMaker {
    private val stringList=mutableListOf(
        R.string.s1,R.string.s2,R.string.s3,R.string.s4,R.string.s5,R.string.s6,
    )
    fun getCountryList(context: Context): MutableList<String> {
        val list: MutableList<String> = mutableListOf()
        stringList.forEach {
            list.add(context.getString(it))
        }

        return list
    }
}