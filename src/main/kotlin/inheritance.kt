//parent class
 open class animal() {
    var age: Int = 78
    var gender: String = "MALE"

    fun ismammal() {
        println("ismammal")


    }

    class duck : animal() {
        var color: String = "BLUE"

        fun swim() {
            println("swimming")

        }
    }

    class fish : animal() {
        var caneat: Boolean = true
        fun swim() {
            println("swimming")
        }

        class horse : animal() {
            var candance: Boolean = true
            fun swim() {
                println("swimming")
            }


            //child class
            fun main() {
                var d = duck()
                println(d.gender)
                var h = horse()
                h.ismammal()

                var f = fish()
                println(f.age)
            }
        }
    }}



