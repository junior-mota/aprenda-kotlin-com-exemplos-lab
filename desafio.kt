// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { INICIAL, MEDIO, AVANCADO }

class Usuario(val nome: String, val nivel: Nivel, val duracao: Int, val conteudo: ConteudoEducacional)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val usuarios: List<Usuario>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na Formação: $nome com nível ${usuario.nivel} e o Conteúdo Educacional: ${usuario.conteudo.nome}.")
    }
}

fun main() {
    
    val conteudoJoao = ConteudoEducacional("Olá, Mundo!", 90, Nivel.INICIAL)
    val conteudoMaria = ConteudoEducacional("Gerenciando Fluxo de Navegação de Apps Android", 120, Nivel.AVANCADO)

    val joao = Usuario("João", Nivel.INICIAL, 90, conteudoJoao)
    val maria = Usuario("Maria", Nivel.AVANCADO, 120, conteudoMaria)
    
    val formacaoKotlin = Formacao("Kotlin", listOf(joao, maria))
    
    formacaoKotlin.matricular(joao)
    formacaoKotlin.matricular(maria)
    
    println("Inscritos na Formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.nome }}")
}
