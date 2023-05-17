import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)

    println("enter temperature")
    var temperature = read.nextInt()
    println(temperature)

    if(temperature<37){
        println("it is too cold warm yourself")
    }

    else if(temperature>37) {

        println("it is too hot take alot of water to not get dehydrated")

    }
      else {
          println("normal temperature")
        }


}