package ru.jelezov.formula1.ui.topTeamFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.jelezov.formula1.databinding.ItemTeamBinding
import ru.jelezov.formula1.model.TopTeamModel

class AdapterFragmentTopTeam() : ListAdapter<TopTeamModel, AdapterFragmentTopTeam.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemTeamBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    class ViewHolder(private val binding: ItemTeamBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: TopTeamModel){
            binding.teamName.text = item.name
            binding.points.text = item.points.toString()
            binding.position.text = item.position.toString()
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class DiffCallback : DiffUtil.ItemCallback<TopTeamModel>() {
    override fun areItemsTheSame(oldItem: TopTeamModel, newItem: TopTeamModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TopTeamModel, newItem: TopTeamModel): Boolean {
        return oldItem == newItem
    }
}