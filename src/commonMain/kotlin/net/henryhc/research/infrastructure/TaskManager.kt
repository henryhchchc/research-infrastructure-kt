package net.henryhc.research.infrastructure

interface TaskManager {

    fun submit(task: Task)

    val tasks: Iterable<Task>


}