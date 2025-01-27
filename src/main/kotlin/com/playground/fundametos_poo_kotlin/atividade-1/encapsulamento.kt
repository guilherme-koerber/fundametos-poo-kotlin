package com.playground.fundametos_poo_kotlin.`atividade-1`

class ContaBancaria {
    private var saldo = 0.0

    fun depositar(valor: Double) {
        saldo += valor
        println("Depósito realizado com sucesso!")
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso!")
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun consultarSaldo() {
       return println("Saldo atual: R$${saldo}")
    }
}

fun main() {
    val conta = ContaBancaria()

    conta.consultarSaldo()
    conta.depositar(100.0)
    conta.consultarSaldo()
    conta.sacar(50.00)
    conta.consultarSaldo()
}
