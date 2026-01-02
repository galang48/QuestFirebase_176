package com.example.myfirebase.model.data

fun Siswa.toUiStateSiswa(
    isEntryValid: Boolean = false
): UIStateSiswa =
    UIStateSiswa(
        detailSiswa = this.toDetailSiswa(),
        isEntryValid = isEntryValid
    )