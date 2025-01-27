package com.playground.fundametos_poo_kotlin.`atividade-1`

abstract class Veiculo(
    val marca: String,
    val modelo: String,
    val ano: Int
) {
    abstract fun acelerar(marcha: Int)
    abstract fun frear(marcha: Int)
}

class Carro(
    marca: String,
    modelo: String,
    ano: Int,
    private var velocidade: Int = 0
) : Veiculo(marca, modelo, ano) {

    private fun trocarMarcha(marcha: Int) {
        velocidade = when (marcha) {
            0 -> 0
            1 -> 30
            2 -> 60
            3 -> 90
            4 -> 130
            5 -> 170
            6 -> 200
            else -> velocidade
        }
    }

    override fun acelerar(marcha: Int) {
        if (marcha == 0) {
            println("O $marca $modelo está parado!")
        } else {
            trocarMarcha(marcha)
            println("O $marca $modelo acelerou para $velocidade km/h.")
        }
    }

    override fun frear(marcha: Int) {
        if (marcha == 0) {
            println("O $marca $modelo está parado!")
        } else {
            trocarMarcha(marcha)
            println("O $marca $modelo freou para $velocidade km/h.")
        }
    }
}

fun main() {
    val meuCarro = Carro(marca = "Mitsubishi", modelo = "ASX", ano = 2016)

    println("Marca: ${meuCarro.marca}")
    println("Modelo: ${meuCarro.modelo}")
    println("Ano: ${meuCarro.ano}")

    meuCarro.acelerar(0)
    meuCarro.acelerar(1)
    meuCarro.acelerar(2)
    meuCarro.acelerar(3)
    meuCarro.acelerar(4)
    meuCarro.frear(3)
}