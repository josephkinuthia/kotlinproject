class person{
    //variables/properties/attribute/datameber
    var name:String="joseph"
    var age:Int=24
    var location:String="kikuyu"
    var yearofbirth:Int=2000


    //methods/function
    fun eat(){
        println("eating")
    }
    fun sleep(){
        println("sleeping")
    }
}
fun main(){
    var teacher=person()
    println(teacher.name)


    teacher.eat()
}