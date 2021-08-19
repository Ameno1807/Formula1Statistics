package ru.jelezov.formula1.ui.topRicersFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ru.jelezov.formula1.databinding.FragmentTopRicesBinding



class FragmentTopRacers: Fragment() {

    private var _binding: FragmentTopRicesBinding? = null
    private val binding get() = _binding!!
    //private val viewModel: FragmentTopRacersViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopRicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // viewModel.loadTopDrivers()
/*
        binding.recyclerView.apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            //val adapter = AdapterFragmentTopRacers()
         /*   viewModel.topDrivers.observe(viewLifecycleOwner, { topDrivers ->
                adapter.submitList(topDrivers)
            })*/
            this.adapter = adapter
        }*/

    }
}