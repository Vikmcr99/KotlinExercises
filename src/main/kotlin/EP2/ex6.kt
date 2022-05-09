package EP2

fun main(){
verificaPrimo()
}

fun primo (num:Int) :Boolean {

    if ((num % 2) == 0 && num !== 2 || num == 1 || num == 9) {
        return false
    } else {
        print("Primo")
        return true
    }
}

fun verificaPrimo(){
    val lista = mutableListOf<Int>()
    while(true){
        print("Digite um numero: ")
        val numero = readLine()!!.toInt()
        lista.add(numero)
        println("Deseja parar?(s/n)")
        val parar = readLine()
        if(parar == "s")
            break
    }
    val listaprimo = mutableListOf<Int>()
    lista.forEach{

        if(primo(it) == true)
            listaprimo.add(1)
        else
            listaprimo.add(0)
    }

    println("A sua lista antiga era: $lista")
    println("Carregando sua lista nova considerando que numeros primos = 1 e nao primos = 0....")
    println(listaprimo)
}

