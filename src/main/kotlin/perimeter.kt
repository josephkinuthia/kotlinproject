import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)

    println("Enter length")
    var length=read.nextInt()
    println(length)

    println("Enter width")
    var width=read.nextInt()
    println(width)

    var perimeter=2*(length+width)

    println("perimeter is $perimeter")
}