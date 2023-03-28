package br.com.felixgilioli.bibliotecaservice.dto.input

import br.com.felixgilioli.bibliotecaservice.entity.Autor
import java.util.*

data class AutorInput(
    val nome: String,
    val descricao: String?
) {
    fun toEntity() = Autor(
        id = UUID.randomUUID(),
        nome = nome,
        descricao = descricao
    )
}