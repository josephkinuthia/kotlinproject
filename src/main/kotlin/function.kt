fun main(){
    //predefined function
    println("kotlin")
    var squareroot=Math.sqrt(55.0)
    println(squareroot)

    var round=Math.ceil(3.45)
    println(round)

     var round1=Math.round(3.46)
    println(round1)

myfun()
    add(56,45)
 mydetails("glory",31)
}
//user -define functions
fun myfun(){

    println("ni weekendi vibaya sana")
}
fun add(num1:Int,num2:Int){
    println("$num1*$num2")
}

fun mydetails(name:String, age:Int){

    println("$name is $age years old")
}
