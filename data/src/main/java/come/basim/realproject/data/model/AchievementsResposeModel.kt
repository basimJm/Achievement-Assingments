package come.basim.realproject.data.model

import com.google.gson.annotations.SerializedName

data class AchievementsResponseModel(
    @SerializedName("id")
    val idAchievments :Int,
    val title :String ,
    val label :String,
    val records :List<RecordModel>

)
