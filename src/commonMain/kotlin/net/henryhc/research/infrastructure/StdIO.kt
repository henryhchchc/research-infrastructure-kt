package net.henryhc.research.infrastructure

import okio.Sink
import okio.Source

interface StdIO {
    fun stdIn(): Sink
    fun stdOut(): Source
    fun stdErr(): Source
}
