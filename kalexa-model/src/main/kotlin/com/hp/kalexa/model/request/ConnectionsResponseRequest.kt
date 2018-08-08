package com.hp.kalexa.model.request

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.hp.kalexa.model.ConnectionsStatus
import com.hp.kalexa.model.json.LocalDateTimeDeserializer
import com.hp.kalexa.model.payload.Payload
import java.time.LocalDateTime


class ConnectionsResponseRequest(
        requestId: String,
        locale: String,
        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        timestamp: LocalDateTime,
        val status: ConnectionsStatus,
        val name: String,
        val payload: Map<String, Any>?,
        val token: String) : Request(requestId, locale, timestamp)