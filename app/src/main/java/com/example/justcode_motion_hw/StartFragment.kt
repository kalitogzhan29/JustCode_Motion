package com.example.justcode_motion_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.justcode_motion_hw.databinding.FragmentMainBinding
import com.example.justcode_motion_hw.databinding.FragmentStartBinding

class StartFragment: AppCompatActivity(){

    private lateinit var binding: FragmentStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cityAdapter=CityAdapter()
    }

    private fun getContinentList(): List<CityListDto> {
        return listOf(
            CityListDto(
                0,
                R.string.s1,
                R.drawable.rectangle19,
                ContinentViewType.CITY),
            CityListDto(
                1,
                R.string.s2,
                R.drawable.rectangle25,
                ContinentViewType.CITY),
            CityListDto(
                2,
                R.string.s3,
                R.drawable.rectangle22,
                ContinentViewType.CITY
            ),
            CityListDto(
                3,
                R.string.s4,
                R.drawable.rectangle26,
                ContinentViewType.CITY
            ),
            CityListDto(
                4,
                R.string.s5,
                R.drawable.rectangle41,
                ContinentViewType.CITY
            ),
            CityListDto(
                5,
                R.string.s6,
                R.drawable.rectangle42,
                ContinentViewType.CITY
            )
        )
    }

}