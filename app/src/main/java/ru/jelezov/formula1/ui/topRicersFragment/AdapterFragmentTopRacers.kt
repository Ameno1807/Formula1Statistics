package ru.jelezov.formula1.ui.topRicersFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/*
class AdapterFragmentTopRacers: ListAdapter<TopDriversModel, AdapterFragmentTopRacers.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemTeamBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    class ViewHolder(private val binding: ItemTeamBinding) : RecyclerView.ViewHolder(binding.root) {
        /*fun bind(item: TopDriversModel){
            binding.points.text = item.points.toString()
            binding.position.text = item.position.toString()
            binding.teamName.text = "1"

        }*/
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
}*/