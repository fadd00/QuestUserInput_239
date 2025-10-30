package com.sample.praktikum_5

import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import java.text.Normalizer

@composable
fun FormDataDiri(modifier: Modifier
){
    //variable - variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    //variable -variable untuk menyimpan data yang diperoleh dari komponer
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }

    val gender:list<String> = listOf("Laki-laki","Perempuan")

    Column(modifier = modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        outlinedTextField(
            value = textNama,
            singleLine = true,
            shape = Modifier.width(250.dp),
            label = { Text(text = "Nama") },
            onValueChange = {

        )
    }
}