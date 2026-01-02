package com.example.myfirebase.model.data

fun DetailSiswa.toDataSiswa(): Siswa =
    Siswa(id, nama, alamat, telpon)