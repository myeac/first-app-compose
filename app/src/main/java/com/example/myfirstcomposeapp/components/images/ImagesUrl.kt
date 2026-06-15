package com.example.myfirstcomposeapp.components.images

import android.util.Log
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun MyImageWithUrlCoil() {
    AsyncImage(
        model = "https://scontent.fplu25-1.fna.fbcdn.net/v/t39.30808-6/474583442_918547617100129_4310261747549163398_n.jpg?stp=dst-jpg_tt6&cstp=mx500x295&ctp=s500x295&_nc_cat=111&ccb=1-7&_nc_sid=cc71e4&_nc_ohc=7UkAvaEWRiYQ7kNvwGc3xTu&_nc_oc=AdrDAJAlwH2NEy4yJOb3PRJNJR0-9CP24-BCL6jVHNMbiDHSNJTJfTkkcZQ6WjsUTNE&_nc_zt=23&_nc_ht=scontent.fplu25-1.fna&_nc_gid=DTV-FHF0iW8RYLB4JKNFbQ&_nc_ss=7b289&oh=00_Af_UNnyn4ueWpdlDnGALTsSuxoY7F2LBE5S1JMX2YolpVA&oe=6A363EA9",
        contentDescription = "image from network",
        modifier = Modifier.size(100.dp),
        onError = { Log.e("error", " ha ocurrido un error gaaaaa ${it.result.throwable.message}")},
    )
}