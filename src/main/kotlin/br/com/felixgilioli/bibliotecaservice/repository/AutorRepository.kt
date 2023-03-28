package br.com.felixgilioli.bibliotecaservice.repository

import br.com.felixgilioli.bibliotecaservice.entity.Autor
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AutorRepository : JpaRepository<Autor, UUID>