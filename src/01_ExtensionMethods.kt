fun removeFirstAndLastCharacter(text: String): String {
    return text.substring(1,text.length-1)
}

// Extension methods are extra functionality to a data-typ class, but they are not written in the data typ's class
// Extension methods can also be implemented for self implemented classes
fun String.removeFirstAndLastCharacterExtension(){
    this.substring(1,this.length-1)
}
fun main(){
    var myName="Farahnaz"
    var result1= removeFirstAndLastCharacter(myName)
    var result2= myName.removeFirstAndLastCharacterExtension()
    println(result1)
    println(result2)
}
