package com.example.myfirebase.repository

import com.example.myfirebase.model.data.Siswa

interface RepositorySiswa {
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
    suspend fun getSatuSiswa(id: Long): Siswa?
    suspend fun editSatuSiswa(
        id: Long,
        siswa: Siswa,
    )

    suspend fun hapusSatuSiswa(id: Long)
}
