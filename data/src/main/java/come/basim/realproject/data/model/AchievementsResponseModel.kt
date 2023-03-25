package come.basim.realproject.data.model

data class AchievementsResponseModel(
    val id: Int,

    val title: String,

    val label: String,

    val records: List<RecordModel>
)
