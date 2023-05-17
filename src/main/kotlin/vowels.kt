import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("enter any alphabet")
    var vowel = read.nextInt()
    println(vowel)

    var letter=read.next().single()

    if (letter=='a'|| letter=='e'|| letter=='i'|| letter=='o'|| letter=='u')

        println("$letter is a vowel")


    else{
        println("$letter is a consonance")
    }











}







