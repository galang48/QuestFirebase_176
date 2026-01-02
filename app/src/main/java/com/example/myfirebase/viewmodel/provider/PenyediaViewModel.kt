package com.example.myfirebase.viewmodel.provider

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myfirebase.viewmodel.EntryViewModel
import com.example.myfirebase.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiDataSiswa().container.repositorySiswa
            )
        }
        initializer {
            EntryViewModel(
                aplikasiDataSiswa().container.repositorySiswa
            )
        }
    }
}