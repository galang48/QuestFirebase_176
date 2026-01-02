package com.example.myfirebase.view.components.form

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.example.myfirebase.R
import com.example.myfirebase.model.data.DetailSiswa

@Composable
fun FormTambahSiswa(
    detailSiswa: DetailSiswa,
    modifier: Modifier = Modifier,
    onValueChange: (DetailSiswa) -> Unit = {},
    enabled: Boolean = true
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(id = R.dimen.padding_medium)
        )
    ) {
        OutlinedTextField(
            value = detailSiswa.nama,
            onValueChange = {
                onValueChange(detailSiswa.copy(nama = it))
            },
            label = { Text(stringResource(R.string.nama)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )

        OutlinedTextField(
            value = detailSiswa.alamat,
            onValueChange = {
                onValueChange(detailSiswa.copy(alamat = it))
            },
            label = { Text(stringResource(R.string.alamat)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )

        OutlinedTextField(
            value = detailSiswa.telpon,
            onValueChange = {
                onValueChange(detailSiswa.copy(telpon = it))
            },
            label = { Text(stringResource(R.string.telpon)) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )

        if (enabled) {
            Text(
                text = stringResource(R.string.required_field),
                modifier = Modifier.padding(
                    start = dimensionResource(id = R.dimen.padding_small)
                ),
                style = MaterialTheme.typography.bodySmall
            )
        }

        HorizontalDivider(
            thickness = dimensionResource(id = R.dimen.padding_small),
            modifier = Modifier.padding(
                bottom = dimensionResource(id = R.dimen.padding_medium)
            )
        )
    }
}