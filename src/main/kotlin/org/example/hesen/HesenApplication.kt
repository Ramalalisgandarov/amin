package org.example.hesen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HesenApplication

fun main(args: Array<String>) {
    runApplication<HesenApplication>(*args)
    println("555")
    println('4')
}
