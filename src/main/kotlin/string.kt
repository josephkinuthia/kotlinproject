/*
string

 */
fun main() {
    var text: String
    text = "hello world"
    var first:String
    first="king"

    var last:String
    last="pac"

    println(text)
    println(text[1])
    println(first+' '+last)
    println(first.plus(last))
    println(text.toUpperCase())
    println(last.length)
    println(text.indexOf("world"))
    println("hello there my name is $first")//sring interpolation


}