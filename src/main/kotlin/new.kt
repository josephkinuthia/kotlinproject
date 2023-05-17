fun main(){
    employee("Mary",5000,"single",false,  "Receptionist", "kenyan",900)
    employee("Cynthia",8000,"married",true,  "Secretary", "Ethiopian",9)
    employee("Chebet",50000,"single",false,  "Manager", "",6)
    employee("Keino",9000,"married",true,  "Receptionist", "kenyan",9)
    employee("Jelagat",9000,"single",false,  "Jenitor", "kenyan",1)
    employee("Jepkosgei",9000,"single",false,  "Secretary", "kenyan",8)
}
fun employee(name:String,salary:Int,status:String,disability:Boolean,position:String,citizenship:String,id:Int){

    println("$name earns $salary and is  $status works as a$position and is a$citizenship with $id" )


}
