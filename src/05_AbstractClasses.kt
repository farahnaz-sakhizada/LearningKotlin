abstract class GraphicObject( var draw:String?){
    fun moveTo(x: Int, y: Int){
        println("current x: $x, current y: $y")
    }
}
//an object cannot be created from an abstract class
//a class can inherit only from one class but many interfaces
class RectangleClass(draw: String?) : GraphicObject(draw){

}
fun main(){
    val myRec= RectangleClass("drawing")
    println(myRec.draw)
}
