package br.com.wagnerrodrigues.ondeeh.model

data class Endereco(
        val logradouro: String,
        val complemento: String,
        val bairro: String,
        val localidade: String,
        val uf: String,
        val cep: String
)