package come.basim.realproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import come.basim.realproject.data.Repository.Repository
import come.basim.realproject.data.model.AchievementsResponseModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = Repository()
    val getAchievementSuccessLiveData: MutableLiveData<List<AchievementsResponseModel>> =
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