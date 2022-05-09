package EP2

fun main() {
    val lista = mutableListOf<Int>()
    while(true){
        print("Digite um numero: ")
        val numero = readLine()!!.toInt()
        lista.add(numero)
        println(lista)
        println("Deseja parar?(s/n)")
        val parar = readLine()
        if(parar == "s")
            break
    }

    var maior = lista[0]
    for(n in lista)
        if(n > maior)
            maior = n
    println("O maior valor da lista é: $maior")
}