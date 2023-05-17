import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)

    println("Enter number:")
    var number=read.nextInt()
    println(number)

    println("Enter dividor:")
    var dividor=read.nextInt()
    println(dividor)

    var quotient=number/dividor


    var remainder=number%dividor


    println("quotient is $quotient")
    println("remainder is $remainder")


}