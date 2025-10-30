package com.sample.praktikum_5

import androidx.compose.ui.Modifier
import java.text.Normalizer

@composable
fun FormDataFiri(modifier: Modifier
){
    //variable - variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }
}