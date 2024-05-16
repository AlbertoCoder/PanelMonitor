package com.albertoalvarezportero.consumocombustible

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class PanelMonitor {

    @Composable
    fun VisorDato(valor:String, etiqueta:String, proporc:Float, tamanyoFuenteEtiqueta:Int,tamanyoFuenteDato:Int,colorIcono: Color, colorExterno: Color, colorInterno: Color) {

        var texto = valor

        Row(


        ) {

            Column(


                modifier = Modifier.fillMaxWidth(proporc).padding(5.dp),


            ) {

                OutlinedTextField(

                    value = texto,
                    onValueChange = { texto = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = {

                        Row(

                            modifier = Modifier.fillMaxWidth()
                        ) {


                            Text(

                                text =
                                etiqueta,
                                fontSize = tamanyoFuenteEtiqueta.sp,
                                color = colorExterno,
                                modifier = Modifier.fillMaxWidth(1f)

                            )


                        }

                    },
                    textStyle =
                    TextStyle(

                        fontSize = tamanyoFuenteDato.sp,
                        textAlign = TextAlign.Center,
                        color = colorInterno,
                        background = Color(0, 0, 0, 0)
                    )

                )


            }


        }


    }
}