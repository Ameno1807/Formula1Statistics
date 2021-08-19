package ru.jelezov.formula1.ui.topTeamFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.jelezov.formula1.model.TopTeamModel
import ru.jelezov.formula1.repository.Repository

import javax.inject.Inject

@HiltViewModel
class FragmentTopTeamViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val topTeam: MutableLiveData<List<TopTeamModel>> = MutableLiveData()

    fun loadTopTeam() {
        viewModelScope.launch(Dispatchers.IO) {
            topTeam.postValue(repository.loadTopTeam())
        }
    }
}