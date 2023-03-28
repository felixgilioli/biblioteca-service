package br.com.felixgilioli.bibliotecaservice.service

import br.com.felixgilioli.bibliotecaservice.dto.input.AutorInput
import br.com.felixgilioli.bibliotecaservice.dto.output.toOutput
import br.com.felixgilioli.bibliotecaservice.repository.AutorRepository
import org.springframework.stereotype.Service

@Service
class AutorService(private val repository: AutorRepository) {

    fun add(autorInput: AutorInput) = repository
        .save(autorInput.toEntity())
        .toOutput()

}