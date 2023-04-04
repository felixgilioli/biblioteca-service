package br.com.felixgilioli.bibliotecaservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate
import java.util.UUID

@Entity
data class Cliente(

    @Id
    val id: UUID,

    val nome: String,

    val sobrenome: String,

    val dataNascimento: LocalDate,

    val cpf: String
)
