package org.bbb.skelton.database

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class DatabaseApplication
fun main(args: Array<String>) {
    runApplication<DatabaseApplication>(*args)
}
