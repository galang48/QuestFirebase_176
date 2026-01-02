package com.example.myfirebase.repository.container

import com.example.myfirebase.repository.FirebaseRepositorySiswa
import com.example.myfirebase.repository.RepositorySiswa

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}