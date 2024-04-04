import java.util.Scanner

fun main(){
    var fibonacciAtual = 0;
    var fibonacciAnterior = 0;
    var auxiliar: Int;

    val leitor = Scanner(System. `in`);
    print("Digite um número: ")
    var valorLido: Int = leitor.nextInt()

    while(fibonacciAtual < valorLido){
        auxiliar = fibonacciAnterior;
        fibonacciAnterior = fibonacciAtual;
        fibonacciAtual = fibonacciAnterior + auxiliar;
        
        if(fibonacciAtual == 0) fibonacciAtual = 1
    }

    if(fibonacciAtual == valorLido) println("$valorLido pertence à sequência") else println("$valorLido não pertence à sequência")
}