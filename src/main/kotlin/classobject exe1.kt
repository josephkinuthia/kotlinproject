class car{
    var name:String="runs"
    var model:String="subaru"
    var color:String="aqua"
    var drivingspeed:Int=390


    fun drive(){
     println("staight")
    }
    fun turn(){
     println("right")
    }
    fun stop(){
     println("at the parking slot")
    }

}


fun main() {

    var benz=car()
    println(benz.color)

    var bmw=car()
    println(benz.model)

    var passio=car()
    println(benz.name)

    var vitz=car()
    println(benz.drivingspeed.toString()+"  "+benz.name+" "+benz.model+"  "+benz.color)



}


