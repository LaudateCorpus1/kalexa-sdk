/*
 * Copyright 2018 HP Development Company, L.P.
 * SPDX-License-Identifier: MIT
 */

package com.hp.kalexa.model.entityresolution

data class Resolution(
    val authority: String,
    val status: Status,
    val values: List<ValueWrapper> = emptyList())
