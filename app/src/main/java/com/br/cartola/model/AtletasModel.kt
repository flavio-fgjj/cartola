package com.br.cartola.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class AtletasModel(
    @SerializedName("atletas")
    val atletas: List<AtletaModel>
)
