package com.lead.nevertell

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
