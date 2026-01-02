package com.example.myfirebase.view.components.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.myfirebase.R
import com.example.myfirebase.model.data.Siswa
import com.example.myfirebase.view.components.common.ItemSiswa
import androidx.compose.foundation.lazy.items

@Composable
fun DaftarSiswa(
    itemSiswa: List<Siswa>,
    onSiswaClick: (Siswa) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(items = itemSiswa, key = { it.id }) { person ->
            ItemSiswa(
                siswa = person,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
                    .clickable { onSiswaClick(person) }
            )
        }
    }
}