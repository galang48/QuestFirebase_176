package com.example.myfirebase.view.components.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.myfirebase.R
import com.example.myfirebase.model.data.Siswa

@Composable
fun DetailDataSiswa(
    siswa: Siswa?,
    modifier: Modifier = Modifier,
) {
    if (siswa == null) return

    Card(
        modifier = modifier,
        colors =
            CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            ),
    ) {
        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium)),
        ) {
            BarisDetailData(
                labelResID = R.string.nama1,
                itemDetail = siswa!!.nama,
                modifier =
                    Modifier.padding(
                        horizontal =
                            dimensionResource(
                                id = R.dimen.padding_medium,
                            ),
                    ),
            )
            BarisDetailData(
                labelResID = R.string.alamat1,
                itemDetail = siswa.alamat,
                modifier =
                    Modifier.padding(
                        horizontal =
                            dimensionResource(
                                id = R.dimen.padding_medium,
                            ),
                    ),
            )
            BarisDetailData(
                labelResID = R.string.telpon1,
                itemDetail = siswa.telpon,
                modifier =
                    Modifier.padding(
                        horizontal =
                            dimensionResource(
                                id = R.dimen.padding_medium,
                            ),
                    ),
            )
        }
    }
}