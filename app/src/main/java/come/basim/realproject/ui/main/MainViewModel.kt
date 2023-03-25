package come.basim.realproject.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.Repository.Repository
import data.model.AchievementsResponseModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = data.Repository.Repository()
    val getAchievementSuccessLiveData: MutableLiveData<List<data.model.AchievementsResponseModel>> =
        MutableLiveData()

    val getAchievementErorrLiveData: MutableLiveData<Exception> =
        MutableLiveData()

    init {
        getAchievements()
    }

    fun getAchievements() {
        viewModelScope.launch {


            try {
                delay(8000)

                val response = repository.getAAchievements()
                getAchievementSuccessLiveData.postValue(response)


            } catch (e: Exception) {
                getAchievementErorrLiveData.postValue(e)

            }


        }

    }


}