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

    val lastindice = lista.lastIndex
    if (lista[0] < lista[lastindice])
        println("Infnet")
    else
        println("Tenfni")
}


