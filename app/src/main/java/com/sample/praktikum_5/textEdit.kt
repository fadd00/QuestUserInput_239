package com.sample.praktikum_5

import android.R.attr.text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
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
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        outlinedTextField(
            value = textNama,
            singleLine = true,
            shape = Modifier.width(250.dp),
            label = { Text(text = "Nama") },
            onValueChange = {
                textNama = it
            }
        )
        row{
            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = { textJK = item }
                ),verticalAlignment = Alignment.CenterVertically{
                    RadioButton(selected = textJK == item,
                        onClick = { textJK = item
                        }
                    )text(item)
                }
                    outlinedTextField(
                        values = textAlamat,
                        singleLine = true,
                        modifier = Modifier.width(250.dp),
                        label = { Text(text = "Alamat lengkap") },
                        onValueChange = {
                            textAlamat = it
                        }
                    )
                {}
            }
        }
    }
}