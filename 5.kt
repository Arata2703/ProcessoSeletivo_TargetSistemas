fun main(){
    println("Digite uma string: ")
    val string: String? = readLine()

    if(string == null){
        println("Nenhuma string foi digitada!")
    }
    else{   
        val tamanhoString: Int = string.length
        var invertido = ""
        
        
        for(contador in string.indices){
            invertido = invertido + string[tamanhoString - contador - 1]
        }
        
        println(invertido)
    }

}