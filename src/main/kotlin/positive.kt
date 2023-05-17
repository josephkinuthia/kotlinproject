import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter number:")
    var number=read.nextInt()
    println(number)

    if (number>0){
        println("It is positive")
    }
    else if(number<0){
        println("It is negative")
    }
    else{
        println("0 is neither positive nor negative")
    }

}