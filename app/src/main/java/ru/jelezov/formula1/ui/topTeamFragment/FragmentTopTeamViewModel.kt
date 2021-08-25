package ru.jelezov.formula1.ui.topTeamFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.jelezov.formula1.repository.Repository

import javax.inject.Inject

@HiltViewModel
class FragmentTopTeamViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val topTeams = repository.loadTopTeam().asLiveData()

}