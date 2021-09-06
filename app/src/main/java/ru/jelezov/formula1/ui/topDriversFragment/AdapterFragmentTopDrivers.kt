package ru.jelezov.formula1.ui.topDriversFragment

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.jelezov.formula1.R
import ru.jelezov.formula1.databinding.ItemDriverBinding
import ru.jelezov.formula1.model.TopDriversModel


class AdapterFragmentTopRacers: ListAdapter<TopDriversModel, AdapterFragmentTopRacers.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemDriverBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    class ViewHolder(private val binding: ItemDriverBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: TopDriversModel){
            binding.points.text = "${item.points} pts"
            binding.driverName.text = item.driver_name
            binding.driverFamily.text = item.driver_family
            binding.position.text = when (item.position) {
                "1" -> "1st place"
                "2" -> "2nd place"
                "3" -> "3rd place"
                else -> "${item.position}th place"
            }
            backgroundViewColor(item.driver_family)
        }

        @SuppressLint("ResourceType")
        private fun backgroundViewColor(driver_family: String) {
            when (driver_family) {
                "Verstappen" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_redbull_car)
                    binding.logoTeam.setBackgroundResource(R.raw.redbull_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.max)
                    binding.driverFlag.setBackgroundResource(R.drawable.nl)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#0600ef"))
                }
                "Pérez" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_redbull_car)
                    binding.logoTeam.setBackgroundResource(R.raw.redbull_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.perrez)
                    binding.driverFlag.setBackgroundResource(R.drawable.it)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#0600ef"))
                }
                "Norris" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_mclaren_car)
                    binding.logoTeam.setBackgroundResource(R.raw.mclaren_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.noris)
                    binding.driverFlag.setBackgroundResource(R.drawable.gb)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#FF9800"))

                }
                "Ricciardo" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_mclaren_car)
                    binding.logoTeam.setBackgroundResource(R.raw.mclaren_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.ricciardo)
                    binding.driverFlag.setBackgroundResource(R.drawable.au)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#FF9800"))

                }
                "Sainz" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_ferrari_car)
                    binding.logoTeam.setBackgroundResource(R.raw.ferrari_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.sainz)
                    binding.driverFlag.setBackgroundResource(R.drawable.es)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#dc0000"))
                }
                "Leclerc" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_ferrari_car)
                    binding.logoTeam.setBackgroundResource(R.raw.ferrari_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.leclerc)
                    binding.driverFlag.setBackgroundResource(R.drawable.mc)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#dc0000"))
                }
                "Ocon" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alpine_car)
                    binding.logoTeam.setBackgroundResource(R.raw.alpine_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.ocon)
                    binding.driverFlag.setBackgroundResource(R.drawable.fr)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#0090ff"))
                }
                "Alonso" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alpine_car)
                    binding.logoTeam.setBackgroundResource(R.raw.alpine_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.alonso)
                    binding.driverFlag.setBackgroundResource(R.drawable.es)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#0090ff"))
                }
                "Tsunoda" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alphatauri_car)
                    binding.logoTeam.setBackgroundResource(R.raw.alpha_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.tsunoda)
                    binding.driverFlag.setBackgroundResource(R.drawable.jp)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#2b4562"))
                }
                "Gasly" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alphatauri_car)
                    binding.logoTeam.setBackgroundResource(R.raw.alpha_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.gasly)
                    binding.driverFlag.setBackgroundResource(R.drawable.fr)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#2b4562"))
                }
                "Stroll" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_astonmartin_car)
                    binding.logoTeam.setBackgroundResource(R.raw.astonmartin_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.stroll)
                    binding.driverFlag.setBackgroundResource(R.drawable.ca)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#006f62"))
                }
                "Vettel" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_astonmartin_car)
                    binding.logoTeam.setBackgroundResource(R.raw.astonmartin_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.vettel)
                    binding.driverFlag.setBackgroundResource(R.drawable.de)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#006f62"))
                }
                "Latifi" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_williams_car)
                    binding.logoTeam.setBackgroundResource(R.raw.williams_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.latifi)
                    binding.driverFlag.setBackgroundResource(R.drawable.ca)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#005aff"))
                }
                "Russell" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_williams_car)
                    binding.logoTeam.setBackgroundResource(R.raw.williams_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.russel)
                    binding.driverFlag.setBackgroundResource(R.drawable.gb)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#005aff"))
                }
                "Räikkönen" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alfaromeo_car)
                    binding.logoTeam.setBackgroundResource(R.raw.alfa_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.kimi)
                    binding.driverFlag.setBackgroundResource(R.drawable.fi)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#900000"))
                }
                "Giovinazzi" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_alfaromeo_car)
                    binding.logoTeam.setBackgroundResource(R.raw.alfa_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.giovinazzi)
                    binding.driverFlag.setBackgroundResource(R.drawable.it)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#900000"))
                }
                "Mazepin" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_haas_car)
                    binding.logoTeam.setBackgroundResource(R.raw.haas_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.mazepin)
                    binding.driverFlag.setBackgroundResource(R.drawable.ru)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#EEEEEE"))
                }
                "Schumacher" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_haas_car)
                    binding.logoTeam.setBackgroundResource(R.raw.haas_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.schum)
                    binding.driverFlag.setBackgroundResource(R.drawable.de)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#EEEEEE"))
                }
                "Bottas" -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_mercedes_car)
                    binding.logoTeam.setBackgroundResource(R.raw.mercedes_logo)
                    binding.driverPhoto.setBackgroundResource(R.raw.bottas)
                    binding.driverFlag.setBackgroundResource(R.drawable.fi)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#00d1bc"))
                }
                else -> {
                    binding.backgroundTeam.setBackgroundResource(R.drawable.bg_mercedes_car)
                    binding.logoTeam.setBackgroundResource(R.raw.mercedes_logo)
                    binding.driverPhoto.setBackgroundResource(R.drawable.lewis)
                    binding.driverFlag.setBackgroundResource(R.drawable.gb)
                    binding.viewTeam.setBackgroundColor(Color.parseColor("#00d1bc"))
                }
            }
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