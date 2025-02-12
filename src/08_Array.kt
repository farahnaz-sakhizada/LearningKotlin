fun main(){
    var myArray= Array<Int>(5) {0}
    var value=10
    for (index in 0..<myArray.size){
        myArray[index]= value
        value++
        println("index of element is $index, value is ${myArray[index]}")
    }
    println("The size of myArray: ${myArray.size}")

    //Array in Kotlin
    var kotlinArray= arrayOf<String>("","")
    kotlinArray[0]="Mohammad"
    kotlinArray[1]="Iman"

}