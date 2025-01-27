package com.playground.fundametos_poo_kotlin.`atividade-2`

class Livro(
    private var titulo: String,
    private var autor: String,
    private var preco: Double
) {

    fun getTitulo(): String {
        return titulo
    }

    fun setTitulo(titulo: String) {
        this.titulo = titulo
    }

    fun getAutor(): String {
        return autor
    }

    fun setAutor(autor: String) {
        this.autor = autor
    }

    fun getPreco(): Double {
        return preco
    }

    fun setPreco(preco: Double) {
        if (preco >= 0) {
            this.preco = preco
        } else {
            println("O preço não pode ser menor que zero!")
        }
    }

    fun exibirInformacoes() {
        println("Título: $titulo | Autor: $autor | Preço: R$${preco}")
    }
}

fun main() {

    val livro = Livro("Código Limpo", "Robert Cecil Martin", 70.00)

    livro.exibirInformacoes()

    livro.setTitulo("O Poder do Hábito")
    livro.setAutor("Charles Duhigg")
    livro.setPreco(55.70)

    livro.exibirInformacoes()

}
