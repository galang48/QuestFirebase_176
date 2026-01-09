
package com.example.myfirebase.viewmodel.provider

import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myfirebase.viewmodel.DetailViewModel
import com.example.myfirebase.viewmodel.EditViewModel
import com.example.myfirebase.viewmodel.EntryViewModel
import com.example.myfirebase.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory =
        viewModelFactory {
            initializer {
                HomeViewModel(
                    aplikasiDataSiswa().container.repositorySiswa,
                )
            }
            initializer {
                EntryViewModel(
                    aplikasiDataSiswa().container.repositorySiswa,
                )
            }
            initializer {
                DetailViewModel(
                    this.createSavedStateHandle(),
                    aplikasiDataSiswa().container.repositorySiswa,
                )
            }
            initializer {
                EditViewModel(
                    this.createSavedStateHandle(),
                    aplikasiDataSiswa().container.repositorySiswa,
                )
            }
        }
}
