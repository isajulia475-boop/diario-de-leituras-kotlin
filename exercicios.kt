// Questão 1: Sistema de Cupons Avançado
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}

// Questão 2: Auditoria de Entregas
fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val valido = endereco ?: "Endereço Desconhecido"
        if (valido == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $valido")
        }
    }
}

// Questão 3: Validação de Perfil de Streaming
fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0
    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

// Questão 4: Processamento de Transações Pix
fun processarTransacoesPix() {
    val transacoes = listOf(50.0, null, 120.5, null, 10.0)
    var total = 0.0
    for (t in transacoes) {
        if (t != null) {
            total += t
        } else {
            println("Transação ignorada")
        }
    }
    println("Total processado: $total")
}

// Questão 5: Classificação de Feedback de Motoristas
fun avaliarMotorista(nota: Int?) {
    val n = nota ?: 0
    when (n) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        else -> println("Nenhuma avaliação fornecida.")
    }
}

// Questão 7: Limpeza de Banco de Dados de Usuários
fun limparBancoUsuarios(emails: List<String?>) {
    var invalidas = 0
    for (e in emails) {
        if (e.isNullOrBlank()) {
            invalidas++
            println("Aviso: Conta inválida marcada para deleção.")
        } else {
            println("Conta válida: $e")
        }
    }
    println("Total de contas para apagar: $invalidas")
}

// Ponto de entrada do programa (Main)
fun main() {
    println("--- Teste Q1 ---")
    println(calcularDesconto(100.0, "PROMO10"))

    println("\n--- Teste Q2 ---")
    auditarEntregas(listOf("Rua A", null, "Rua B"))

    println("\n--- Teste Q3 ---")
    validarBioInfantil("Olá Mundo")

    println("\n--- Teste Q4 ---")
    processarTransacoesPix()

    println("\n--- Teste Q5 ---")
    avaliarMotorista(5)

    println("\n--- Teste Q6 ---")
    val gorjeta: (Double?) -> Double = { g -> if (g == null || g < 0) 0.0 else g }
    println(gorjeta(10.0))

    println("\n--- Teste Q7 ---")
    limparBancoUsuarios(listOf("teste@email.com", null, ""))
}
