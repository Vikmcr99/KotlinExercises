package EP2

fun main(){
    fatorial()
}


fun fatorial(){

    println("Digite um numero: ")
    var numero = readLine()!!.toInt()
    var f = 1
    while (numero > 0){
        f *= numero
        numero --
    }

    println("O resultado do fatorial é: $f")
}