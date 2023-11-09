package com.example.justcode_motion_hw

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.justcode_motion_hw.databinding.ItemCityBinding

class CityAdapter:
        RecyclerView.Adapter< BaseViewHolder.BaseCityViewHolder<*>>() {

    class CityViewHolder(binding: ItemCityBinding) :
        BaseViewHolder.BaseCityViewHolder<ItemCityBinding>(binding) {
        override fun bindView(item: CityListDto) {
            with(binding) {
                image.setImageResource(item.image)
                title.text = itemView.context.getString(item.name)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder.BaseCityViewHolder<*> {
        return CityViewHolder(
            ItemCityBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int =items.size


    override fun onBindViewHolder(holder: BaseViewHolder.BaseCityViewHolder<*>, position: Int) {
//        holder.bindView(items[position].name)
    }
}


data class CityListDto (
    val id: Int,
    @StringRes
    val name: Int,
    @DrawableRes
    val image: Int,
    val type: ContinentViewType
)

enum class ContinentViewType {
    CITY, SPACER
}

