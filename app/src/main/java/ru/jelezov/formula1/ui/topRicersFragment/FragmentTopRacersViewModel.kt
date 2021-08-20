package ru.jelezov.formula1.ui.topRicersFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.repository.Repository
import javax.inject.Inject

@HiltViewModel
class FragmentTopRacersViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

   val topDrivers: MutableLiveData<List<TopDriversModel>> = MutableLiveData()

   fun loadTopDrivers() {
        viewModelScope.launch(Dispatchers.IO) {
            topDrivers.postValue(repository.loadTopDrivers())
        }
    }
}