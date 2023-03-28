package br.com.felixgilioli.bibliotecaservice.dto.output

import br.com.felixgilioli.bibliotecaservice.entity.Autor
import java.util.*

data class AutorOutput(
    val id: UUID,
    val nome: String,
    val descricao: String?
)

fun Autor.toOutput() = AutorOutput(
    id = this.id,
    nome = this.nome,
    descricao = this.descricao
)