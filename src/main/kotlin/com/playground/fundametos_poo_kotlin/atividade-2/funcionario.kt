package com.playground.fundametos_poo_kotlin.`atividade-2`

open class Funcionario(val nome: String, val salario: Double) {

    open fun exibirDetalhes() {
        println("Nome: $nome | Salário: R$${salario}")
    }

    open fun bonificacao(): Double {
        return salario * 0.1
    }
}

class Gerente(
    nome: String,
    salario: Double,
    val areaResponsavel: String
) : Funcionario(nome, salario) {

    override fun exibirDetalhes() {
        super.exibirDetalhes()
        println("Área Responsável: $areaResponsavel")
    }

    override fun bonificacao(): Double {
        return salario * 0.2
    }
}

class Desenvolvedor(nome: String, salario: Double, val linguagemProgramacao: String) : Funcionario(nome, salario) {

    override fun exibirDetalhes() {
        super.exibirDetalhes()
        println("Linguagem de Programação: $linguagemProgramacao")
    }

    override fun bonificacao(): Double {
        return salario * 0.15
    }
}

fun main() {
    val funcionario = Funcionario("João", 4000.00)
    val gerente = Gerente("Bruno", 8000.00, "Financeiro")
    val desenvolvedor = Desenvolvedor("Pedro", 6000.00, "Kotlin")

    val funcionarios: List<Funcionario> = listOf(funcionario, gerente, desenvolvedor)
    
    for (f in funcionarios) {
        f.exibirDetalhes()
        println("Bonificação: R$${f.bonificacao()}")
    }
}
