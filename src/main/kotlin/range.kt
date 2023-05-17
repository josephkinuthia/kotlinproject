fun main(){
    for (number in 10..15){
        println(number)
    }

    for (string in 'c'..'f' ){
        println(string)
    }

    for(num1 in 1..10){
        if (num1==6) {
            break
        }
        println(num1)
    }

    for (letter in 'a'..'f') {
        if (letter == 'c') {
            continue
        }
        println(letter)
    }
}
