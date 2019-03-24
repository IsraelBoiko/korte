package com.soywiz.korte.internal

internal fun Int.mask(): Int = (1 shl this) - 1
internal fun Int.extract(offset: Int, count: Int): Int = (this ushr offset) and count.mask()
