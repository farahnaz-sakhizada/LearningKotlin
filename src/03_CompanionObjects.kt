//Companion-classes are used to access the class' attributes and methods without creating an object of this class
// in other word the Companion-class contains its object inside itself
//hardly used
class CompanionClass{
    companion object{
        private var myName= "Fara"
        fun showMyName()= myName
    }
}

fun main(){
    println(CompanionClass.showMyName())
}