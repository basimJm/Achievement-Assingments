package come.basim.realproject.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import data.model.AchievementsResponseModel
import data.model.RecordModel
import come.basim.realproject.databinding.RowAchievementBinding
import come.basim.realproject.databinding.RowModelBinding

class RecordsAdapter(private val list: List<data.model.RecordModel>) :
    RecyclerView.Adapter<RecordsAdapter.MedalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedalViewHolder {
        val binding =
            RowModelBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MedalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedalViewHolder, position: Int) {
    holder.bind(list[position])

    }

    inner class MedalViewHolder(private val binding: RowModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: data.model.RecordModel) {
            binding.model = item
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}