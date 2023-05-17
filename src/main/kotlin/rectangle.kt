import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)



    println("enter length")
    var length = read.nextInt()
    println(length)

    println("enter width")
    var width = read.nextInt()
    println(width)

    var area=length*width

    println("The area is $area")


}
