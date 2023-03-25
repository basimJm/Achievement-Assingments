package come.basim.realproject.data.api



import data2.model.WrappedAchievementsResponseModel
import retrofit2.http.GET

interface ProjectApi {

    @GET("/achievements")
    suspend fun getAchievements(): WrappedAchievementsResponseModel

}