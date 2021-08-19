package ru.jelezov.formula1.ui.topTeamFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import ru.jelezov.formula1.databinding.FragmentTopTeamBinding

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

        viewModel.loadTopTeam()

        binding.recyclerView.apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            val adapter = AdapterFragmentTopTeam()
            viewModel.topTeam.observe(viewLifecycleOwner, { topTeam ->
                adapter.submitList(topTeam)
            })
            this.adapter = adapter
        }

    }
}