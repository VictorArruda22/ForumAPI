package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class NovoTopicoForm (

    @NotEmpty @Size(min = 5, max = 100) val titulo: String,
    @NotEmpty val mensagem: String,
    @NotNull val idCurso: Long,
    @NotNull val idAutor: Long
        )
