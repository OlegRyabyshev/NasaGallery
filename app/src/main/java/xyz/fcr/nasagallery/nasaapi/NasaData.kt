package xyz.fcr.nasagallery.nasaapi

data class NasaData(
    val date: String,
    val explanation: String,
    val hdUrl: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String
)