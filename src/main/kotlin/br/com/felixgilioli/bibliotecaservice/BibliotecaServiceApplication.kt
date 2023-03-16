package br.com.felixgilioli.bibliotecaservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BibliotecaServiceApplication

fun main(args: Array<String>) {
	runApplication<BibliotecaServiceApplication>(*args)
}
