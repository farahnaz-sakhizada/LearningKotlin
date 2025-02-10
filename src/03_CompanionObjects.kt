//Companion-classes are used to access the class' attributes and methodes without creating an object of this class
// in other word the Companion-class contains it's object inside itself
//hardly used
class CompanionClass{
    companion object{
        var myName= "Fara"
        fun showMyName()= myName
    }
}

fun main(){
    println(CompanionClass.showMyName())
}