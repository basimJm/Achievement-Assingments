package come.basim.realproject.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import data.model.AchievementsResponseModel
import come.basim.realproject.databinding.RowAchievementBinding

class AchievementAdapter(private val list: List<data.model.AchievementsResponseModel>) :
    RecyclerView.Adapter<AchievementAdapter.MedalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedalViewHolder {
        val binding =
            RowAchievementBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MedalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedalViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class MedalViewHolder(private val binding: RowAchievementBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(model: data.model.AchievementsResponseModel) {
            binding.model = model
            binding.recycleViewModel.adapter=RecordsAdapter(model.records)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}

