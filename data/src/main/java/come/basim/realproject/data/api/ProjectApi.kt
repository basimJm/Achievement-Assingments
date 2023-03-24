package come.basim.realproject.data.api

import come.basim.realproject.data.model.AchievementsResponseModel
import come.basim.realproject.data.model.WrappedAchievementsResponseModel
import retrofit2.http.GET

interface ProjectApi {

    @GET("/achievements")
   suspend fun getAchievements(): WrappedAchievementsResponseModel

}