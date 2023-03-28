package br.com.felixgilioli.bibliotecaservice.controller

import br.com.felixgilioli.bibliotecaservice.dto.input.AutorInput
import br.com.felixgilioli.bibliotecaservice.service.AutorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/autor")
class AutorController(private val autorService: AutorService) {

    @PostMapping
    fun add(@RequestBody autorInput: AutorInput) = autorService.add(autorInput)
}