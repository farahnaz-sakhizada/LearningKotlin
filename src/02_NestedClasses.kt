class Outer{
    val outerString= "this is the outer String"

    class Inner{
        val innerString="this is the inner String"
        fun showInnerString(): String {
            return innerString
        }
        //one lined function
        fun showTestString(): String = "this is a test string"
    }
    inner class Inner2{
        //access to the attributes of the OuterClass from the InnerClass
        val accessToOuterString= outerString
    }
}


fun main(){
    println(Outer().outerString)
    println(Outer.Inner().innerString)
    println(Outer.Inner().showInnerString())
    //access to the attributes of the OuterClass from the InnerClass
    println(Outer().Inner2().accessToOuterString)

}