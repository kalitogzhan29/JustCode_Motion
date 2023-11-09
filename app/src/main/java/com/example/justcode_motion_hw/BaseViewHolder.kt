package com.example.justcode_motion_hw

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

class BaseViewHolder {
    abstract class BaseViewHolder<VB : ViewBinding, T>(protected open val binding: VB) :
        RecyclerView.ViewHolder(binding.root) {
        abstract fun bindView(item: T)
    }


    abstract class BaseCityViewHolder<VB : ViewBinding>(override val binding: VB) :
        BaseViewHolder<VB, CityListDto>(binding)
}