package com.playground.fundametos_poo_kotlin.`atividade-1`

interface Pagamento {
    fun realizarPagamento(valor: Double)
    fun cancelarPagamento()
}

class CartaoCredito(private val nomeCartao: String) : Pagamento {
    override fun realizarPagamento(valor: Double) {
        println("Pagamento de R$${valor} realizado com cartão de crédito: $nomeCartao.")
    }

    override fun cancelarPagamento() {
        println("Pagamento com cartão de crédito $nomeCartao foi cancelado.")
    }
}

class Boleto(private val codigoBarras: String) : Pagamento {
    override fun realizarPagamento(valor: Double) {
        println("Pagamento de R$${valor} realizado com boleto de código: $codigoBarras.")
    }

    override fun cancelarPagamento() {
        println("Pagamento com boleto de código $codigoBarras foi cancelado.")
    }
}

fun main() {

    val pagamentoCartao = CartaoCredito("Caju")
    val pagamentoBoleto = Boleto("123456789101112131415161718192000")

    pagamentoCartao.realizarPagamento(120.0)
    pagamentoCartao.cancelarPagamento()

    pagamentoBoleto.realizarPagamento(200.0)
    pagamentoBoleto.cancelarPagamento()
}
