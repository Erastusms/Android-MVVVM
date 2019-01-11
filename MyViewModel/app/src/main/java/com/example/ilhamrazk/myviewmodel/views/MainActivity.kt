package com.example.ilhamrazk.myviewmodel.views

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ilhamrazk.myviewmodel.R
import com.example.ilhamrazk.myviewmodel.databinding.ActivityMainBinding
import com.example.ilhamrazk.myviewmodel.models.Mahasiswa
import com.example.ilhamrazk.myviewmodel.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.main = viewModel

        val mhs = Mahasiswa("15201234","Leonel Messi","Informatika")
        viewModel.setData(mhs)
    }
}
