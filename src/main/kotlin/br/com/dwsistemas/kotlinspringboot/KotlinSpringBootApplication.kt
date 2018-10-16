package br.com.dwsistemas.kotlinspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootApplication>(*args)
}
