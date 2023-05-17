fun main() {
    var languages = arrayOf("java script", "kotlin", "java")

    println(languages[0])
    //reassignment or accesing an element

    languages[0] = "python"//changing an element
    println(languages[0])


    for (kin in languages){
        println(kin)
        println(kin.length)
    }
}



