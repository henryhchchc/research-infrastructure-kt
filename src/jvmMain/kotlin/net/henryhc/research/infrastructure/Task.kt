package net.henryhc.research.infrastructure

interface Task {
    fun start()
    fun kill()
    fun waitFor()
}
