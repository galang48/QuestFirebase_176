package com.example.myfirebase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.myfirebase.repository.AplikasiDataSiswa

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa)