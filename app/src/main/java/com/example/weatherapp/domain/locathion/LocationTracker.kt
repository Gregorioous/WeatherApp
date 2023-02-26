package com.example.weatherapp.domain.locathion

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}