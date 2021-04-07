package vowelsAndConsonants

fun main(){

    var line = "Hi, it's nice to meet you. I'm Matt and this is my stupid APP."
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.toLowerCase()
    for (element in line){
        when (element){
            'a','e','i', 'o', 'u' -> ++vowels
            in 'a'..'z' -> ++consonants
            in '0'..'9' -> ++digits
            ' ' -> ++spaces
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White Space: $spaces")
}