package ru.jelezov.formula1.ui.topTeamFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import ru.jelezov.formula1.R
import ru.jelezov.formula1.databinding.FragmentTopTeamBinding
import ru.jelezov.formula1.utils.ItemDecoration
import ru.jelezov.formula1.utils.Resource

@AndroidEntryPoint
class FragmentTopTeam: Fragment() {
    private var _binding: FragmentTopTeamBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FragmentTopTeamViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopTeamBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        decorateStockList(binding.recyclerTeams)
        binding.recyclerTeams.apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            val adapter = AdapterFragmentTopTeam()
            viewModel.topTeams.observe(viewLifecycleOwner, { teams ->
                adapter.submitList(teams.data)

                binding.progressBar.isVisible = teams is Resource.Loading && teams.data.isNullOrEmpty()
                binding.textViewError.isVisible = teams is Resource.Error && teams.data.isNullOrEmpty()
                binding.textViewError.text = teams.error?.localizedMessage
            })
            this.adapter = adapter
        }
    }

    private fun decorateStockList(recyclerView: RecyclerView) {
        recyclerView.apply {
            val alterBackground = ResourcesCompat
                .getDrawable(resources, R.drawable.bg_light_shape, context.theme)!!
            val mainBackground = ResourcesCompat
                .getDrawable(resources, R.drawable.bg_dark_shape, context.theme)!!

            val decoration =
                ItemDecoration(alterBackground, mainBackground)
            addItemDecoration(decoration)
            hasFixedSize()
        }
    }
}