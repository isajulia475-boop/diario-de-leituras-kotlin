// 1. Modelagem com POO
class Livro(
    val titulo: String,
    val totalPaginas: Int,
    val genero: Int, // 1: Ficcao, 2: Terror, 3: Tecnico, 4: Fantasia/Romance
    val paginasLidas: Int, // Int
    val concluido: Boolean, // Boolean (Requisito atendido)
    val citacao: String? = null // Null Safety: campo opcional
)

class SessaoLeitura(
    val data: String,
    val paginasLidas: Int
)

class Leitor(
    val nome: String,
    val metaAnualPaginas: Int
) {
    private val sessoes = mutableListOf<SessaoLeitura>()

    fun registrarSessao(sessao: SessaoLeitura) {
        sessoes.add(sessao)
    }

    // 2. Laco de repeticao para somar as paginas lidas
    fun calcularTotalPaginasAno(): Int {
        var total = 0
        for (sessao in sessoes) {
            total += sessao.paginasLidas
        }
        return total
    }
}

fun main() {
    // Instanciando o Leitor
    val leitor = Leitor("Isa", metaAnualPaginas = 1500)

    // Criando a lista de livros com paginas lidas e status Boolean
    val livros = listOf(
        Livro("O Hobbit", 310, 1, 310, true, "Em um buraco na terra vivia um hobbit."),
        Livro("Harry Potter e a Pedra Filosofal", 264, 1, 264, true, "Todo mundo tem luz e trevas dentro de si..."),
        Livro("Anne de Green Gables", 384, 4, 384, true, "Não é o que o mundo traz a você, sim o que você traz ao mundo."),
        Livro("Jogos Vorazes", 400, 1, 400, true, "Que a sorte esteja sempre a seu favor."),
        Livro("A Selecao", 336, 4, 200, false),
        Livro("Nao Mexa Nesse Celular", 220, 2, 220, true, "Cuidado com o que você procura."),
        Livro("Nao Leia Esse Arquivo", 180, 2, 90, false) // Livro sem citacao para testar o Null Safety
    )

    // Simulando sessoes de leitura ao longo do ano
    leitor.registrarSessao(SessaoLeitura("10/01/2026", 250))
    leitor.registrarSessao(SessaoLeitura("15/03/2026", 350))
    leitor.registrarSessao(SessaoLeitura("20/06/2026", 300))
    leitor.registrarSessao(SessaoLeitura("12/09/2026", 400))
    leitor.registrarSessao(SessaoLeitura("01/10/2026", 400))

    println("=== DIARIO DE LEITURAS DE ${leitor.nome.uppercase()} ===\n")

    // Exibindo os livros cadastrados, progresso e citacoes
    for (livro in livros) {
        println("Livro: ${livro.titulo}")
        println("   Total de Paginas: ${livro.totalPaginas}")
        println("   Paginas Lidas: ${livro.paginasLidas}")

        // Calculo da porcentagem de conclusao (Double)
        val porcentagemConclusao: Double = (livro.paginasLidas.toDouble() / livro.totalPaginas) * 100
        println("   Progresso: %.1f%% concluído".format(porcentagemConclusao))

        // Uso da variavel Boolean para status
        if (livro.concluido) {
            println("   Status: Livro Finalizado")
        } else {
            println("   Status: Leitura em Andamento")
        }

        // 4. Genero do Livro (when)
        val statusEmocao = when (livro.genero) {
            1 -> "Viajando para outro mundo"
            2 -> "Lendo de luz acesa"
            3 -> "Aumentando o QI"
            4 -> "Com o coracao quentinho"
            else -> "Genero nao catalogado"
        }
        println("   Emocao: $statusEmocao")

        // 5. Citacao Favorita (Null Safety com operador Elvis ?: )
        val citacaoExibida = livro.citacao ?: "Nenhuma citacao favorita cadastrada."
        println("   Citacao: \"$citacaoExibida\"")
        println("-".repeat(40))
    }

    // 3. Meta Atingida (if/else)
    val totalAnual = leitor.calcularTotalPaginasAno()
    println("\n=== RESUMO ANUAL ===")
    println("Total de paginas lidas no ano: $totalAnual")

    if (totalAnual >= leitor.metaAnualPaginas) {
        println("Parabens! Voce atingiu sua meta de leitura do ano!")
    } else {
        val restante = leitor.metaAnualPaginas - totalAnual
        println("Continue lendo! Faltam $restante paginas para alcancar sua meta.")
    }
}
