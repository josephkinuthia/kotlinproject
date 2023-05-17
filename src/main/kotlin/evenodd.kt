import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter number:")
    var number = read.nextInt()
    println(number)




    if (number % 2 == 0) {
        println("It is even")
    } else
        println("It is odd")
}