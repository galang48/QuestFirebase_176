package com.example.myfirebase.model.data

fun Siswa.toDetailSiswa(): DetailSiswa =
    DetailSiswa(id, nama, alamat, telpon)