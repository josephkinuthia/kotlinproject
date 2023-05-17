fun main(){
    var number=6
    var result =when(number){
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        6->"six"
        else->"invalid number"
    }
    println("the number is $result")
}