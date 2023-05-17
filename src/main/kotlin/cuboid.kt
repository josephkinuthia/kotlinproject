import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("enter length")
    var length=read.nextInt()
    println(length)


    println("enter height")
    var height=read.nextInt()
    println(height)

    println("enter width")
    var width=read.nextInt()
    println(width)

    var volume=length*width*height
    println("the volume is $volume")


}
