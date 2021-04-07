package vowelsAndConsonants

fun main(){

    var line = "Hi, it's nice to meet you. I'm Matt and this is my stupid APP."
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.toLowerCase()
    for (element in line){
        if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u'){
            ++vowels
        }else if (element in 'a'..'z') {
            ++consonants
        } else if (element in 'o'..9.toChar()) {
            ++digits
        } else if (element == ' ') {
            ++spaces
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White Space: $spaces")
}