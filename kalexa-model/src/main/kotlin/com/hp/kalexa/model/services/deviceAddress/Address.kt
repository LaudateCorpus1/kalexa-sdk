package com.hp.kalexa.model.services.deviceAddress


data class Address(
        val addressLine1: String? = null,
        val addressLine2: String? = null,
        val addressLine3: String? = null,
        val countryCode: String? = null,
        val stateOrRegion: String? = null,
        val city: String? = null,
        val districtOrCounty: String? = null,
        val postalCode: String? = null)