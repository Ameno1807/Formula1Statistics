package ru.jelezov.formula1.ui.raceCalendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.jelezov.formula1.R
import ru.jelezov.formula1.databinding.FragmentRaceCalendarBinding
import ru.jelezov.formula1.databinding.FragmentTopRicesBinding

class FragmentRaceCalendar: Fragment() {

    private var _binding: FragmentRaceCalendarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRaceCalendarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}