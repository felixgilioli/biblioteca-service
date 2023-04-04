package br.com.felixgilioli.bibliotecaservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class Editora(

    @Id
    val id: UUID,

    val nome: String
)
