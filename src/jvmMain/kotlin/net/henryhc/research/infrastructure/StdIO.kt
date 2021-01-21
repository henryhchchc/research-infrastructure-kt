package net.henryhc.research.infrastructure

import java.io.InputStream
import java.io.OutputStream

interface StdIO {
    fun openStdIn(): OutputStream
    fun openStdOut(): InputStream
    fun openStdErr(): InputStream
}
