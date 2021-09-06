package ru.jelezov.formula1.ui.topTeamFragment

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import ru.jelezov.formula1.R
import ru.jelezov.formula1.databinding.ItemTeamBinding
import ru.jelezov.formula1.model.TopTeamModel

class AdapterFragmentTopTeam() : ListAdapter<TopTeamModel, AdapterFragmentTopTeam.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemTeamBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    class ViewHolder(private val binding: ItemTeamBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: TopTeamModel){
            binding.teamName.text = item.name
            binding.points.text = "${item.points} pts"
            binding.position.text =  when (item.position) {
                "1" -> "1st place"
                "2" -> "2nd place"
                "3" -> "3rd place"
                else -> "${item.position}th place"
            }
            backgroundViewColor(item.name)
        }

        @SuppressLint("ResourceType")
        private fun backgroundViewColor(text: String) {
            when (text) {
                "Red Bull" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_redbull)
                    binding.logoTeam.setBackgroundResource(R.raw.redbull_logo)
                    binding.carTeam.setBackgroundResource(R.raw.redbull_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#0600ef"))
                }
                "McLaren" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_mclaren)
                    binding.logoTeam.setBackgroundResource(R.raw.mclaren_logo)
                    binding.carTeam.setBackgroundResource(R.raw.mclaren_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#FF9800"))

                }
                "Ferrari" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_ferrari)
                    binding.logoTeam.setBackgroundResource(R.raw.ferrari_logo)
                    binding.carTeam.setBackgroundResource(R.raw.ferrari_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#dc0000"))
                }
                "Alpine F1 Team" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alpine)
                    binding.logoTeam.setBackgroundResource(R.raw.alpine_logo)
                    binding.carTeam.setBackgroundResource(R.raw.alpine_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#0090ff"))
                }
                "AlphaTauri" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alphatauri)
                    binding.logoTeam.setBackgroundResource(R.raw.alpha_logo)
                    binding.carTeam.setBackgroundResource(R.raw.alphatauri_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#2b4562"))
                }
                "Aston Martin" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_astonmartin)
                    binding.logoTeam.setBackgroundResource(R.raw.astonmartin_logo)
                    binding.carTeam.setBackgroundResource(R.raw.astonmartin_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#006f62"))
                }
                "Williams" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_williams)
                    binding.logoTeam.setBackgroundResource(R.raw.williams_logo)
                    binding.carTeam.setBackgroundResource(R.raw.williams_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#005aff"))
                }
                "Alfa Romeo" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alfaromeo)
                    binding.logoTeam.setBackgroundResource(R.raw.alfa_logo)
                    binding.carTeam.setBackgroundResource(R.raw.alphatauri_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#900000"))
                }
                "Haas F1 Team" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_haas)
                    binding.logoTeam.setBackgroundResource(R.raw.haas_logo)
                    binding.carTeam.setBackgroundResource(R.raw.haas_car)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#E0E0E0"))
                }
                else -> binding.backgroundTeam.setBackgroundResource(R.drawable.bg_mercedes)
            }
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