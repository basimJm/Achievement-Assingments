package come.basim.realproject.data.Repository

import come.basim.realproject.data.api.ProjectApi
import come.basim.realproject.data.model.AchievementsResponseModel
import come.basim.realproject.data.model.WrappedAchievementsResponseModel
import come.basim.realproject.data.network.RetrofitBuilder

class Repository {
   suspend fun getAAchievements(): List<AchievementsResponseModel> {
        val achievementApi =RetrofitBuilder.getInstance().create(ProjectApi::class.java)
        return achievementApi.getAchievements().data

    }
}