package com.playground.fundametos_poo_kotlin.`atividade-2`

class Pessoa(val nome: String, val idade: Int, val profissao: String) {
    fun saudacao() {
        println("Olá, meu nome é $nome, tenho $idade anos e minha profissão é $profissao.")
    }
}

class Produto(val nome: String, val sku: Int, val preco: Double) {
    fun consultar() {
        println("Produto: $nome | SKU: ${sku} | Preço: R$${preco}")
    }
}

class Veiculo(val marca: String, val modelo: String, val ano: Int) {
    fun detalhes() {
        println("Marca: ${marca} | Modelo: $modelo | Ano: $ano")
    }
}

fun main() {

    val pessoa1 = Pessoa("Guilherme", 23, "Desenvolvedor")
    val pessoa2 = Pessoa("Cauê", 28, "Especialista Desenvolvedor")

    pessoa1.saudacao()
    pessoa2.saudacao()

    val produto1 = Produto("iPhone 15", 9099,4699.00)
    val produto2 = Produto("Macbook Pro M2", 12390,14000.00)

    produto1.consultar()
    produto2.consultar()

    val veiculo1 = Veiculo("Mitsubishi","ASX", 2016)
    val veiculo2 = Veiculo("Honda","Civic", 2022)

    veiculo1.detalhes()
    veiculo2.detalhes()
}
