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
    var soma = 0
    var produto = 1
    for(n in lista)
        if(n % 2 == 0)
            soma += n
        else
            produto *= n

    println("A sua lista final é: $lista")
    println("A soma dos pares é: $soma")
    println("O produto dos impares é: $produto")
}