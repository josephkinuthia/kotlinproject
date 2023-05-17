open class shape1{
    open  fun area(){
        println("This is the area")
    }
}
class oval:shape(){
    override fun area(){
        println("area of oval")
    }
}
class square:shape()  {
    override fun area(){
        println("area of square")
    }
}

class octagon:shape() {
    override  fun area(){
        println("area of octagon")
    }
}
fun main(){
    var ci=oval()
    ci.area()

    var tri=square()
    tri.area()

    var rec=octagon()
    rec.area()
}
