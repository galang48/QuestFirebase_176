package com.example.myfirebase.repository

import android.app.Application
import com.example.myfirebase.repository.container.ContainerApp
import com.example.myfirebase.repository.container.DefaultContainerApp

class AplikasiDataSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}