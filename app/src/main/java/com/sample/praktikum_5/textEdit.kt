package com.sample.praktikum_5

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
}