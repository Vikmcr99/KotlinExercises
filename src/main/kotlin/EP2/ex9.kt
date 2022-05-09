package EP2

import java.time.LocalDate
import java.time.temporal.ChronoUnit


class data(val dia:Int, val mes: Int, val ano: Int){
    fun bissexto() : Boolean{
        if(ano % 4 == 0)
            println("O ano é bissexto")
            return true
    }
    fun diasMes(){
        if(mes == 4 || mes == 6 || mes == 9|| mes == 11)
            println("Este mes possui 30 dias")
        if(mes == 2)
            println("Este mes possui 28 dias")
        if(mes == 2 && bissexto())
            println("Este mes possui 29 dias")
        else
            println("Este mes possui 31 dias")

        /*val dias = Calendar.getInstance()
        dias.getMaximum(Calendar.DAY_OF_MONTH)*/
    }

    fun diasParaOPrimeiro(){
        val dia = LocalDate.of(ano, mes, dia)
        val diaUm = LocalDate.of(ano +1, 1,1)
        val diasPara = ChronoUnit.DAYS.between(dia, diaUm)
        println("Faltam $diasPara para o ano novo!!!!!")
}
}

fun main(){
    val data = data(26,8, 2000 )
    data.bissexto()
    data.diasMes()
    data.diasParaOPrimeiro()
}