package br.com.felixgilioli.bibliotecaservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity
data class Livro(

    @Id
    val id: UUID,

    val titulo: String,

    val paginas: Int,

    val isbn: String,

    @ManyToOne
    @JoinColumn
    val autor: Autor,

    @ManyToOne
    @JoinColumn
    val editora: Editora
)
