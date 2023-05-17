import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter number:")
    var number = read.nextInt()
    println(number)

    println("Enter dividor:")
    var divide=read.nextInt()
    println(divide)


    println("Enter adder:")
    var adder=read.nextInt()
    println(adder)

    println("Enter subtractor:")
    var sub=read.nextInt()
    println(sub)

    println("Enter mulitplier:")
    var mulply=read.nextInt()
    println(mulply)






    var divider=number/divide
    var addition=number+adder
    var subtraction=number-sub
    var multiplication=number*mulply



    println(" is $divider")
    println(" when addded $addition")
    println(" when subtracted $subtraction")
    println(" when multiplied6 $multiplication")


}

