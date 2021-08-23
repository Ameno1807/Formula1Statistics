package ru.jelezov.formula1.ui.topDriversFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.jelezov.formula1.databinding.ItemDriverBinding
import ru.jelezov.formula1.model.TopDriversModel


class AdapterFragmentTopRacers: ListAdapter<TopDriversModel, AdapterFragmentTopRacers.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemDriverBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    class ViewHolder(private val binding: ItemDriverBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: TopDriversModel){
            binding.points.text = item.points
            binding.position.text = item.position
            binding.driverName.text = item.driver_name
            binding.driverFamily.text = item.driver_family
            binding.teamName.text = item.Constructors.joinToString { it.name }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class DiffCallback : DiffUtil.ItemCallback<TopDriversModel>() {
    override fun areItemsTheSame(oldItem: TopDriversModel, newItem: TopDriversModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TopDriversModel, newItem: TopDriversModel): Boolean {
        return oldItem.position == newItem.position
    }
}