package ru.jelezov.formula1.ui.topDriversFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import ru.jelezov.formula1.R
import ru.jelezov.formula1.databinding.FragmentTopDriversBinding
import ru.jelezov.formula1.utils.ItemDecoration

@AndroidEntryPoint
class FragmentTopDrivers: Fragment() {

    private var _binding: FragmentTopDriversBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FragmentTopDriversViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopDriversBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.loadTopDrivers()

        decorateStockList(binding.recyclerDrivers)
        binding.recyclerDrivers.apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            val adapter = AdapterFragmentTopRacers()
            viewModel.topDrivers.observe(viewLifecycleOwner, { topDrivers ->
                adapter.submitList(topDrivers)
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