# 📚 Diário de Leituras - Clube do Livro

Projeto desenvolvido em **Kotlin** para a disciplina de Programação, simulando um sistema inteligente de acompanhamento de leituras, controlo de progresso e gestão de metas anuais para um clube do livro.

---

## 🛠️ Tecnologias e Conceitos Aplicados
* **Linguagem:** Kotlin
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Tipos de Dados:** `Int`, `Double`, `String`, `Boolean` e coleções (`MutableList`).
* **Controlo de Fluxo e Lógica:** 
  * Estruturas condicionais (`if / else`) para validação do atingimento da meta anual de páginas.
  * Estruturas de seleção (`when`) para classificar as emoções e reações de acordo com o género literário.
  * Laços de repetição (`for`) para percorrer e somar o volume de páginas lidas nas sessões.
* **Segurança de Tipos:** Utilização robusta de *Null Safety* (`String?` e operador Elvis `?:`) para o tratamento seguro de cotações favoritas opcionais.

---

## 🏗️ Arquitetura e Modelagem de Classes

O sistema foi estruturado de forma modular utilizando POO através das seguintes classes:

1. **`Livro`**: Modela a obra literária, contendo atributos como título, total de páginas, género, páginas lidas, estado de conclusão (`Boolean`) e citação favorita opcional.
2. **`SessaoLeitura`**: Regista cada momento de leitura com a respetiva data e volume de páginas consumidas.
3. **`Leitor`**: Gere o perfil do utilizador, a meta anual estipulada e o agregado de sessões de leitura, calculando o total anual por meio de iterações.

---

## 📊 Regras de Negócio Implementadas
* **Progresso Individual:** Cálculo dinâmico da percentagem de conclusão de cada livro utilizando valores do tipo `Double`.
* **Avaliação de Metas:** Verificação automática se o somatório anual de páginas atinge ou supera a meta definida pelo leitor.
* **Mapeamento Emocional:** Tradução de códigos numéricos de géneros literários em estados emocionais através da estrutura `when`.

---

## 🚀 Como Executar
1. Certifique-se de que possui o ficheiro `main.kt` devidamente atualizado no seu repositório.
2. Pode testar, compilar e executar o código diretamente no ambiente oficial [Kotlin Playground](https://play.kotlinlang.org/).
