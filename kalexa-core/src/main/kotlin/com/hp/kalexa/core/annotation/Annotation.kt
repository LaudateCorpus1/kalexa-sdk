package com.hp.kalexa.core.annotation

@Target(AnnotationTarget.CLASS)
annotation class LaunchIntent

@Target(AnnotationTarget.CLASS)
annotation class RecoverIntentContext

@Target(AnnotationTarget.CLASS)
annotation class FallbackIntent

@Target(AnnotationTarget.CLASS)
annotation class HelpIntent

@Target(AnnotationTarget.CLASS)
annotation class Intent(vararg val mapsTo: String)

@Target(AnnotationTarget.CLASS)
annotation class FulfillerIntent