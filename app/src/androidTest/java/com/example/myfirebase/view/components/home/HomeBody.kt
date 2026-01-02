package com.example.myfirebase.view.components.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myfirebase.view.components.common.ErrorScreen
import com.example.myfirebase.view.components.common.LoadingScreen
import com.example.myfirebase.viewmodel.StatusUiSiswa

@Composable
fun HomeBody(
    statusUiSiswa: StatusUiSiswa,
    onSiswaClick: (Int) -> Unit,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        when (statusUiSiswa) {
            is StatusUiSiswa.Loading -> LoadingScreen()
            is StatusUiSiswa.Success ->
                DaftarSiswa(
                    itemSiswa = statusUiSiswa.siswa,
                    onSiswaClick = { onSiswaClick(it.id.toInt()) }
                )
            is StatusUiSiswa.Error ->
                ErrorScreen(
                    retryAction = retryAction,
                    modifier = Modifier.fillMaxSize()
                )
        }
    }
}