open class shape{
    open  fun area(){
        println("This is the area")
    }
}
class circle:shape(){
    override fun area(){
        println("area of circle")
    }
}
class triangle:shape()  {
    override fun area(){
        println("area of triangle")
    }
}

class rectangle:shape() {
    override  fun area(){
        println("area of rectangle")
    }
}
fun main(){
    var ci=circle()
    ci.area()

    var tri=triangle()
    tri.area()

    var rec=rectangle()
    rec.area()
}
