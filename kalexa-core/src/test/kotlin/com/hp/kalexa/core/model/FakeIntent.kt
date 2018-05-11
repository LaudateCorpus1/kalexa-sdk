package com.hp.kalexa.core.model

import com.hp.kalexa.core.annotation.Fallback
import com.hp.kalexa.core.annotation.Intents
import com.hp.kalexa.core.annotation.Launcher
import com.hp.kalexa.core.annotation.RecoverIntentContext
import com.hp.kalexa.core.intent.BuiltInIntent
import com.hp.kalexa.core.intent.IntentExecutor
import com.hp.kalexa.model.request.ConnectionsResponseRequest
import com.hp.kalexa.model.request.ElementSelectedRequest
import com.hp.kalexa.model.request.IntentRequest
import com.hp.kalexa.model.request.LaunchRequest
import com.hp.kalexa.model.response.AlexaResponse
import com.hp.kalexa.model.response.alexaResponse

@Launcher
@Intents(intentNames = ["FirstIntent", "SecondIntent", "ThirdIntent"])
@Fallback
@RecoverIntentContext
class FakeIntent : IntentExecutor() {
    override fun onLaunchIntent(request: LaunchRequest): AlexaResponse {
        return alexaResponse {
            response {
                speech {
                    "This is a hello from FakeIntent@onLaunchIntent"
                }
            }
        }
    }

    override fun onIntentRequest(request: IntentRequest): AlexaResponse {
        return alexaResponse {
            response {
                speech {
                    "This is a hello from FakeIntent"
                }
                simpleCard {
                    title = "Hello world"
                    content = "This is a content coming from FakeIntent"
                }
            }
        }
    }

    override fun onFallbackIntent(request: IntentRequest): AlexaResponse {
        return alexaResponse { response { speech { "This is a fallback response" } } }
    }

    override fun onUnknownIntentContext(builtInIntent: BuiltInIntent): AlexaResponse {
        return alexaResponse { response { speech { "This is a unknown intent context response" } } }
    }

}