package com.playground.fundametos_poo_kotlin.`atividade-1`

open class Animal(val nome: String) {

    open fun emitirSom() {
        println("$nome está emitindo um som.")
    }
}

class Cachorro(nome: String) : Animal(nome) {

    override fun emitirSom() {
        println("O cachorro chamado $nome está latindo!")
    }
}

class Gato(nome: String) : Animal(nome) {

    override fun emitirSom() {
        println("O gato chamado $nome está miando!")
    }
}

fun main() {
    val cachorro = Cachorro("Bruce")
    val gato = Gato("Garfield")

    cachorro.emitirSom()
    gato.emitirSom()
}
