package br.com.felixgilioli.bibliotecaservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class Emprestimo(

    @Id
    val id: UUID,

    @ManyToOne
    @JoinColumn
    val livro: Livro,

    @ManyToOne
    @JoinColumn
    val cliente: Cliente,

    val data: LocalDateTime
)
