package net.julionogueira.ethnographer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform