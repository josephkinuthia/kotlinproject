class dog(var breed:String, var SIZE:String, var age:Int, var color:String){

    fun eat(action:String){
        println("eating")
    }
    fun sleep() {
        println("sleeping")
    }
    }fun sIT() {
        println("sitting")
    }
    fun run() {
    println("sleeping")
}


fun main(){
    var d=dog("nealpolitan","large",5,"black")
    println(d.breed+" "+d.SIZE+" "+d.age+" " +d.color)

     var p=dog("maltese","small",2,"white")
    println(p.breed+" "+p.SIZE+" "+p.age+" " +p.color)

      var c=dog("chow","median",3,"brown")
    println(c.breed+" "+c.SIZE+" "+c.age+" " +c.color)

      p.eat("EATING")
      d.sleep()

}

