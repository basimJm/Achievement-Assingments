package come.basim.realproject.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import come.basim.realproject.R
import come.basim.realproject.databinding.ActivityMainBinding
import come.basim.realproject.databinding.RowModelBinding
import come.basim.realproject.ui.main.adapter.AchievementAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       initViewModel()
    initObserver()

    }

    private fun initObserver() {
    viewModel.getAchievementSuccessLiveData.observe(this){response ->
        binding.recycleViewAchievement.adapter=AchievementAdapter(response)

    }

        viewModel.getAchievementErorrLiveData.observe(this){e ->

        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}